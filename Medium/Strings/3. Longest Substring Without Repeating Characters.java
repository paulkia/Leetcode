class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> chars = new HashSet<>();
            int tempLength = 0;
            for (int j = i; j < s.length(); j++) {
                if (chars.contains(s.charAt(j)))
                    break;
                chars.add(s.charAt(j));
                tempLength++;
            }
            if (maxLength < tempLength) {
                maxLength = tempLength;
            }
        }
        return maxLength;
    }
}