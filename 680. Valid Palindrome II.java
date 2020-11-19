class Solution {
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            int other = s.length() - 1 - i;
            if (s.charAt(i) != s.charAt(other)) {
                if (isPalindrome(s.substring(0, i) + s.substring(i+1)))
                    return true;
                if (isPalindrome(s.substring(0, other) + s.substring(other+1)))
                    return true;
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}