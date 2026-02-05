class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        obstacleGrid[0][0] = 1;

        // fill the first column cell (i,0)
        for(int i = 1; i < row; i++){
            // current cell is 0 and above cell is 1
            if(obstacleGrid[i][0] == 0 && obstacleGrid[i-1][0] == 1){
                obstacleGrid[i][0] = 1;
            }
            else{
                // need to set it to 0 cos it is obstacle
                obstacleGrid[i][0] = 0;
            }
        }
        // fill first row cell (0,i)
        for(int i = 1; i < col; i++){
            //current cell is 0 and left cell is 1
            if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1){
                obstacleGrid[0][i] = 1;
            }
            else{
                obstacleGrid[0][i] = 0;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                // Obstacle found, no paths through this cell
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }
                // Number of paths is the sum of paths from above and from the left
                else{
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }

        return obstacleGrid[row-1][col-1];
    }
}