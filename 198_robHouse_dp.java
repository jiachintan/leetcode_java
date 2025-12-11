class Solution {
    public int rob(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            // just rob if only 1 house
            return nums[0];
        }

        int n = nums.length;

        // dp[i] = maximum money you can rob up to house i
        int[] dp = new int[n];
        dp[0] = nums[0];

        // For the second house, choose the maximum between:
        // - rob house 1
        // - rob house 2
        dp[1] = Math.max(dp[0], nums[1]);
        
        for(int i = 2; i < n; i++){

            // Either:
            // - rob current house + dp of house before previous (i-2)
            // - skip current house and take dp[i-1]
            int robCurrentHouse = nums[i] + dp[i-2];
            int skipCurrentHouse = dp[i-1];
            dp[i] = Math.max(robCurrentHouse, skipCurrentHouse);
        }

        return dp[n-1];
    }
}