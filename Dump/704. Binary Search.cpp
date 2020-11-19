class Solution {
public:
    int search(vector<int>& nums, int target) {
        int mid, min = 0, max = nums.size() - 1;
        while (min <= max) {
            mid = (max - min) / 2 + min;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
};