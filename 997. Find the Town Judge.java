class Solution {
    public int findJudge(int N, int[][] trust) {
        int trustNum = N-1;
        int[] trusted = new int[N];
        for (int i = 0; i < trust.length; i++) {
            trusted[trust[i][1]-1]++;
        }
        for (int i = 0; i < trusted.length; i++) {
            if (trusted[i] == trustNum) {
                for (int j = 0; j < trust.length; j++) {
                    if (trust[j][0] == i + 1)
                        break;
                    else if (j == trust.length - 1)
                        return i + 1;
                }
            }
        }
        if (trust.length == 0 && N == 1)
            return 1;
        return -1;
    }
}