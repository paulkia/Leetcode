class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0)
            return m * n;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] < minX)
                minX = ops[i][0];
            if (ops[i][1] < minY)
                minY = ops[i][1];
        }
        return minX * minY;
    }
}