import java.util.Arrays;



/*
* Product of Array Except Self
* Given an integer array arr, return an array arr such that arr[i] is equal to the product of all the elements of arr except arr[i].

The product of any prefix or suffix of arr is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: arr = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: arr = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] result=productArrayItSelf(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productArrayItSelf(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;right[n-1]=1;
        for(int i=1;i<n;i++)
            left[i]=left[i-1]*arr[i-1];
        for(int i=n-2;i>=0;i--)
            right[i]=right[i+1]*arr[i+1];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++)
            arr[i]=left[i]*right[i];
        return arr;
    }


}
