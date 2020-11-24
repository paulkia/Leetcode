/*
Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation: 
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
*/
class Solution {
struct pair_compare {
    bool operator() (pair<int, int> p1, pair<int, int> p2) const {
        return p1.first != p2.first ? p1.first < p2.first : p1.second < p2.second;
    }
};
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        vector<vector<int>> result;
        set<pair<int, int>, pair_compare> sizeToIndex;
        set<pair<int, int>, pair_compare>::iterator itr;
        
        for (int i = 0; i < groupSizes.size(); i++) {
            sizeToIndex.insert({groupSizes[i], i});
        }
        
        itr = sizeToIndex.begin();
        while (itr != sizeToIndex.end()) {
            int groupSize = (*itr).first;
            vector<int> currGroup;
            while (groupSize > 0) {
                currGroup.push_back((*itr).second);
                groupSize--;
                itr++;
            }
            result.push_back(currGroup);
        }
        
        return result;
    }
};