/*
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers
into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the
lowest possible order (i.e., sorted in ascending order).

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a
sequence or linear order.

        Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
*/

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1));  // [2, 4, 5, 0, 1, 7]

        int[] arr2 = {3, 2, 1};
        nextPermutation(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2));  // [1, 2, 3]

        int[] arr3 = {3, 4, 2, 5, 1};
        nextPermutation(arr3);
        System.out.println("Output 3: " + Arrays.toString(arr3));  // [3, 4, 5, 1, 2]
    }
    static void nextPermutation(int[] arr){
        int n=arr.length;
        int i=n-2;
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr,int start ,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

}
