import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        
        // minPathSums[i] stores the minimum path sum from the current row down to the bottom
        int[] minPathSums = new int[height];

        // Initialize the DP array with the values of the bottom row (the leaf nodes)
        List<Integer> bottomRow = triangle.get(height - 1);
        for (int i = 0; i < height; i++) {
            minPathSums[i] = bottomRow.get(i);
        }

        // Process the triangle starting from the second-to-last row moving upwards
        for (int row = height - 2; row >= 0; row--) {
            List<Integer> currentRow = triangle.get(row);
            
            for (int col = 0; col <= row; col++) {
                // The min path for the current cell is its own value 
                // plus the smaller of its two direct children from the row below.
                int leftChild = minPathSums[col];
                int rightChild = minPathSums[col + 1];
                
                minPathSums[col] = currentRow.get(col) + Math.min(leftChild, rightChild);
            }
        }

        // The top of the triangle now contains the minimum path sum for the whole structure
        return minPathSums[0];
    }
}