/*
In a string s of lowercase letters, these letters form consecutive groups of the same character.
For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group.
	In the above example, "xxxx" has the interval [3,6].
A group is considered large if it has 3 or more characters.
Return the intervals of every large group sorted in increasing order by start index.
*/
class Solution {
public:
    vector<vector<int>> largeGroupPositions(string s) {
        vector<vector<int>> result;
        for (int index = 0; index < s.length(); index++) {
            if (index < s.length() - 2 && s[index] == s[index + 1] && s[index] == s[index + 2]) {
                vector<int> sub(1, index);
                int c = s[index];
                while (index < s.length() && s[index] == c) {
                    index++;
                }
                index--;
                sub.push_back(index);
                result.push_back(sub);
            }
        }
        return result;
    }
};