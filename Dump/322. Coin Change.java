// My first exposure to dynamic programming. Had no idea what I was doing. Followed a tutorial.
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dynamicProgramming = new int[amount + 1]; //accounting for zero basing
        Arrays.fill(dynamicProgramming, amount + 1); //fill with impossible values
        dynamicProgramming[0] = 0;
        for (int i = 0; i < dynamicProgramming.length; i++) { // for each sub-solution
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    dynamicProgramming[i] = Math.min(dynamicProgramming[i], 1 + dynamicProgramming[i - coins[j]]);
            }            
        }
        return dynamicProgramming[amount] > amount ? -1 : dynamicProgramming[amount];
    }
}