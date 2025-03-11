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
        Integer grid[][]={{0,0,0,0,5},
                          {0,1,1,1,0},
                          {2,0,0,6,0}};
         maxtStonePath(grid);
    }

    private static void maxtStonePath(Integer[][] grid) {
        int len = grid.length - 1; // Number of rows - 1 (2 in this case)
        int sum = grid[len][0];    // Start from bottom-left corner (grid[2][0] = 2)
        int j = 0;                 // Column index (starting at 0)

        for(int i=len;i>=0;i--){
            while(j<grid[i].length){
                if(i==0&&j<grid[i].length) {
                    sum = sum + grid[i][j + 1];
                    j++;
                    if (j == grid[i].length - 1)
                        break;
                } else if (grid[i][j+1]>grid[i-1][j]) {
                    sum=sum+grid[i][j+1];
                    j++;
                } else if (grid[i][j+1]<=grid[i-1][j]) {
                    sum=sum+grid[i-1][j];
                    break;
                }
            }
        }
        System.out.println("Maximum Stone collected: "+sum);
    }
}
