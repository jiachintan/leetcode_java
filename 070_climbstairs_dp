class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }

        int[] dp = new int[n+1];
        dp[1] = 1; // 1 way to reach step 1
        dp[2] = 2; // 2 ways to reach step 2 (1+1, 2)

        for(int i = 3; i <= n; i++){
            // Ways to reach step i = 
            // ways to reach (i-1) + ways to reach (i-2)
            // because from (i-1) you take 1 step
            // from (i-2) you take 2 steps
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
