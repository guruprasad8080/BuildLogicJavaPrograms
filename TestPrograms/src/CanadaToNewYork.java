/*Problem Statement:
Travelling from Canada to New York  there are stones in between to collect, collect the maximum number of stones .
note: you can only move north(up) or/and east(right).
Ex: Integer grid[][]={{0,0,0,0,5},{0,1,1,1,0},{2,0,0,0,0}};
Answer:2+0+1+1+1+0+5=10
* */
public class CanadaToNewYork {
    public static void main(String[] args) {
        Integer grid[][]={{0,0,0,0,5},
                          {0,1,1,1,0},
                          {2,0,0,0,0}};
        System.out.println("Maximum Stone collected: "+ maxtStonePath(grid));
    }

    private static String maxtStonePath(Integer[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] dp=new int[rows][cols];
        return "";
    }


}
