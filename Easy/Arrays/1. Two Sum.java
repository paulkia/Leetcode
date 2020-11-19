class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = {0, 0};
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (m.get(pair) != null && m.get(pair) != i) {
                sol[0] = m.get(pair);
                sol[1] = i;
            }
            m.put(nums[i], i);
        }
        return sol;
    }
}