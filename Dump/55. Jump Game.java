class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] goods = new boolean[nums.length];
        goods[goods.length - 1] = true;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums[i]; j >= 0; j--) {
                if (j + i >= goods.length || goods[i + j])
                    goods[i] = true;
            }
        }
        
        return goods[0];
    }
    
}