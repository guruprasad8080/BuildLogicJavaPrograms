public class PascalsTriangle {
    public static void main(String[] args){
        int row=8;
        int[][] pascalTri=new int[row][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    pascalTri[i][j]=1;
                }else{
                    pascalTri[i][j]=pascalTri[i-1][j-1]+pascalTri[i-1][j];
                }
                System.out.print(pascalTri[i][j]+" ");
            }
            System.out.println();
        }
    }
}
