class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        return calculateCost(1, n, dp);
    }

    private int calculateCost(int start, int end, int[][] dp) {
        if (start >= end) return 0;

        if (dp[start][end] != 0) return dp[start][end];

        int minCost = Integer.MAX_VALUE;

        for (int guess = (start + end) / 2; guess <= end; guess++) {
            int cost = guess + Math.max(calculateCost(start, guess - 1, dp), calculateCost(guess + 1, end, dp));
            minCost = Math.min(minCost, cost);
        }

        dp[start][end] = minCost;
        return minCost;
    }
}
