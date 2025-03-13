/*Problem Statement:
Travelling from Canada to New York  there are stones in between to collect, collect the maximum number of stones .
note: you can only move north(up) or/and east(right).
Ex: Integer grid[][]={{0,0,0,0,5},
                      {0,1,1,1,0},
                      {2,0,0,0,0}};
Answer:2+0+1+1+1+0+5=10
* */
public class CanadaToNewYork {
    public static void main(String[] args) {
        Integer[][] grid={{0,0,0,0,5},
                          {0,1,1,1,0},
                          {2,0,0,6,0}};
         maxtStonePath(grid);
    }

    private static void maxtStonePath(Integer[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // DP table to store max stones collected at each cell
        int[][] dp = new int[rows][cols];

        // Initialize the bottom-left starting point
        dp[rows - 1][0] = grid[rows - 1][0];

        // Fill the DP table
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                // Get max stones from the left and bottom cells
                int fromRight = (j > 0) ? dp[i][j - 1] : 0;
                int fromBottom = (i < rows - 1) ? dp[i + 1][j] : 0;

                // Update the current cell with max possible stones
                dp[i][j] = Math.max(fromRight, fromBottom) + grid[i][j];
            }
        }
        // The answer is in the top-right corner
        System.out.println("Maximum Stone collected: "+dp[0][cols - 1]);
    }
}
