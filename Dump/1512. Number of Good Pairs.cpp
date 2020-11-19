class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int goodPairs = 0;
        map<int, int> numToCount;
        map<int, int>::iterator itr;
        
        // Build number to its count
        for (int i : nums) {
            // If map contains, then increment
            if (numToCount.count(i) == 1) {
                itr = numToCount.find(i);
                goodPairs += itr->second;
                itr->second++;
            } else {
                numToCount.insert(pair<int, int>(i, 1));
            }
        }
        
        return goodPairs;
    }
};