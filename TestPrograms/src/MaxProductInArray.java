import java.util.Arrays;

public class MaxProductInArray {
    public static void main(String[] args){
        int[] arr={-10,11,-6,1,0,2,5,7};
        int n=3;
        Arrays.sort(arr);
        int len=arr.length;

        long maxProduct1=1;
        for(int i=len-1;i>=len-n;i--){
            maxProduct1*=arr[i];
        }

        long maxProduct2=1;
        for(int i=0;i<n;i++){
            maxProduct2*=arr[i];
        }
        System.out.println(maxProduct1);
        System.out.println(maxProduct2);
        System.out.println("Result: "+ Math.max(maxProduct1,maxProduct2));
    }
}
