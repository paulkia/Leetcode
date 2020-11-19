class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_set<char> gemSet;
        int numGems = 0;
        for (int i = 0; i < J.length(); i++) {
            gemSet.insert(J[i]);
        }
        for (int i = 0; i < S.length(); i++) {
            if (gemSet.find(S[i]) != gemSet.end()) {
                numGems++;
            }
        }
        return numGems;
    }
};