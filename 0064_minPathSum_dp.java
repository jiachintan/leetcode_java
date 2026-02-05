class Solution {
    public int minPathSum(int[][] grid) {

        // Number of rows in the grid
        int row = grid.length;

        // Number of columns in the grid
        int col = grid[0].length;

        // DP array to store minimum path sum to each cell
        int[][] dp = new int[row][col];

        // Base case: starting cell (top-left corner)
        dp[0][0] = grid[0][0];

        // Fill the first row
        // Can only come from the left
        for (int i = 1; i < col; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        // Fill the first column
        // Can only come from above
        for (int i = 1; i < row; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        // Fill the rest of the grid
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {

                // Take the minimum path from top or left
                dp[i][j] = grid[i][j] 
                         + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // The answer is stored at the bottom-right cell
        return dp[row - 1][col - 1];
    }
}

