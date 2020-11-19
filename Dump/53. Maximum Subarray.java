class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int tempSum = nums[0];
        int maxSum = tempSum;
        for (int i = 1; i < nums.length; i++) {
            if (tempSum < 0 && tempSum < nums[i])
                tempSum = nums[i];
            else tempSum += nums[i];
            if (maxSum < tempSum)
                maxSum = tempSum;
        }
        return maxSum;
    }
}