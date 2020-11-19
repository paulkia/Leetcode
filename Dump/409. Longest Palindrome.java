class Solution {
    public int longestPalindrome(String s) {
        // acc
        int result = 0;
        // stores char counts
        Map<Character, Integer> m = new HashMap<>();
        // whether we have used up our palindrome center
        boolean odd = false;
        
        // setup map
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (m.containsKey(curr))
                m.put(curr, m.get(curr) + 1);
            else
                m.put(curr, 1);
        }
        
        // read map
        for (char c : m.keySet()) {
            if (m.get(c) % 2 == 0)
                result += m.get(c);
            // our first odd number
            else if (!odd) {
                result += m.get(c);
                odd = true;
            } else
                result += m.get(c) - 1;
        }
        
        return result;
    }
}