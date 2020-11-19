class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        int max = 0;

        // Find max num candies (O(N))
        for (int c : candies)
            max = Math.max(max, c);

        // Built result array by comparing candy amounts (O(N))
        for (int i = 0; i < candies.length; i++)
            result.add(candies[i] + extraCandies >= max);

        return result;
    }
}
    