class Solution {
    public int uniquePaths(int m, int n) {
        int row = m;
        int col = n;

        int[][] dp = new int[row][col];

        // fill first row with 1
        for(int i = 0; i < col; i++){
            dp[0][i] = 1;
        }

        // fill first col with 1 after first row
        for(int i = 1; i < row; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                // to go to current cell
                // left cell + top cell
                dp[i][j] = dp[i][j-1] + dp[i-1][j]; 
            }
        }

        return dp[row-1][col-1];
    }
}