class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // init
        int[] result = new int[nums1.length];
        Map<Integer, Integer> loc = new HashMap<>();
        
        // fill locator map
        for (int i = 0; i < nums2.length; i++) {
            loc.put(nums2[i], i);
        }
        
        // Search through nums1, nums2
        for (int i = 0; i < nums1.length; i++) {
            int curr = nums1[i];
            boolean notFound = true;
            for (int j = loc.get(curr); j < nums2.length && notFound; j++) {
                if (nums2[j] > curr) {
                    result[i] = nums2[j];
                    notFound = false;
                }
            }
            if (notFound)
                result[i] = -1;
        }
        return result;
    }
}