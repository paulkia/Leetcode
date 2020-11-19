class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[i] = i == 0 ? nums[i] : nums[i] + result[i - 1];
        return result;
    }
}