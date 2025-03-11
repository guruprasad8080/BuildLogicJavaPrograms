import java.util.Arrays;

/*Problem Statement:
Given an array of integer , rotating array of elements by k elements eight left or right.
Example: if k=2  int[] arr={1,2,3,4,5,6};
output: [5, 6, 1, 2, 3, 4]
* */
public class RotatedByKElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=2;
        rotateEle(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateEle(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(n==0||n==1){
            return;
        }
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
