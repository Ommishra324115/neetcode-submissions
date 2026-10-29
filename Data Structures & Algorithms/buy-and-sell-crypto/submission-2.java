class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 0) {
            return 0;
        }

        int[] minPrice = new int[n];
        int[] dp = new int[n];

        minPrice[0] = prices[0];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            minPrice[i] = Math.min(minPrice[i - 1], prices[i]);

            int profit = prices[i] - minPrice[i];

            dp[i] = Math.max(dp[i - 1], profit);
        }

        return dp[n - 1];
    }
}