class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> parens = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                parens.push(')');
            else if (s.charAt(i) == '{' || s.charAt(i) == '[')
                parens.push((char) (s.charAt(i) + 2));
            else if (parens.size() == 0 || s.charAt(i) != parens.pop())
                return false;
        }
        return parens.size() == 0;
    }
}