class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        // 2 <= cost.length <= 1000
        
        // Step 0 and Step 1 cost nothing to stand on (you haven't taken a step yet)
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i <= n; i++){
            // Option 1: come from step i-1 → need to pay cost[i-1]
            int oneStep = dp[i-1] + cost[i-1];
            // Option 2: come from step i-2 → need to pay cost[i-2]
            int twoStep = dp[i-2] + cost[i-2];

            // Choose the cheaper option
            dp[i] = Math.min(oneStep, twoStep);
        }
        // dp[n] contains the minimum cost to reach the top
        return dp[n];
    }
}
