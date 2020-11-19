class Solution {
    public int findContentChildren(int[] c, int[] k) {
        Arrays.sort(c);
        Arrays.sort(k);
        int cIndex = 0, result = 0;
        for (int i = 0; i < k.length; i++) {
            if (cIndex == c.length)
                return c.length;
            if (k[i] >= c[cIndex]) {
                cIndex++;
                result++;
            }
        }
        return result;
    }
}