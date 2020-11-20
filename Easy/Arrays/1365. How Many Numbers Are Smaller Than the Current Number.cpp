/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
*/
class Solution {
public:
    // Dynamic programming-ish O(N) solution.
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> freq(101);
        vector<int> result(nums.size());
        
        for (int i = 0; i < nums.size(); i++) {
            freq[nums[i]]++;
        }
        for (int i = 1; i < freq.size(); i++) {
            freq[i] += freq[i-1];
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != 0) {
                result[i] = freq[nums[i] - 1];
            }
        }
        
        return result;
    }
};