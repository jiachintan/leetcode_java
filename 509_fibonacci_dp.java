class Solution {
    public int fib(int n) {
        // If n is 0 or 1, return n directly (because F(0)=0, F(1)=1)
        if (n == 0 || n == 1) {
            return n;
        }

        // Create a DP array of size n+1 to store Fibonacci results
        int[] dp = new int[n + 1];

        // Set base cases: F(1) = 1, F(2) = 1
        dp[1] = 1;     // Fibonacci of 1
        dp[2] = 1;     // Fibonacci of 2

        // Fill the DP array starting from index 3 up to n
        for (int i = 3; i <= n; i++) {
            // Current Fibonacci number = sum of previous two Fibonacci numbers
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return the final Fibonacci result stored at dp[n]
        return dp[n];
    }
}
