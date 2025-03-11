
/*Problem Statement:
Given 2D grid having 0 and 1 where 0 represents empty space and 1 represents rock. Assume no gravity .
The lowest row represents the ground,
and the height increases in the 'y' direction When gravity is back how many rocks will fall from their original place?
Input:
1011
0101
1100
1100
* */
public class GravityProblem {
    public static void main(String[] args) {
        int[][] arr={
                {1,0,1,1},
                {0,1,0,1},
                {1,1,0,0},
                {1,1,0,0}
        };
        gravityFalls(arr, arr.length);
    }

    public static void gravityFalls(int arr[][],int n){
        int resp=0;
        for(int i=0;i<n;i++){
            resp=resp+shiftZeros(arr[i],i);
        }
        System.out.println("Count of rocks position shifted: "+resp);
    }

    public static int shiftZeros(int[] arr,int col){
        int pos=0;
        int shifted=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0&&i!=0){
                int temp=arr[pos];
                if(arr[pos]!=0){
                    shifted=shifted+i-pos;
                }
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }

        }
        System.out.println("Count of rocks position changed in each column: "+col+" is "+shifted);
        return shifted;
    }
}
