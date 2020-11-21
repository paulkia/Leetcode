/*
Given a VPS represented as string s, return the nesting depth of s.
VPS is a string with any opening parenthesis that also close.
E.g. ((a(b))cccc) return 3.
*/
class Solution {
public:
    int maxDepth(string s) {
        int maxInt = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(') {
                count++;
                maxInt = max(count, maxInt);
            } else if (s[i] == ')') {
                count--;
            }
        }
        return maxInt;
    }
};