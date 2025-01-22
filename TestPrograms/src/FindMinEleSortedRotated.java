public class FindMinEleSortedRotated {
    /* Find the Minimum Element Sorted Rotated
    *  Using Binary Search concept
    *  Involves leveraging the array's properties to locate the smallest element efficiently in
    *  Time Complexity 𝑂(log n).
    * A sorted rotated array has two parts:
      Left portion where elements are larger.
      Right portion where elements are smaller.
    * The minimum element is the pivot point where the rotation occurs.
    * A property of the rotated sorted array:
       The rightmost element helps determine which part of the array the middle element belongs to.
    * */
    public static void main(String[] args){
        int[] arr={5,6, 7, 8,0, 1, 2, 3, 4};
        System.out.println("Result: "+findMin(arr));
    }

    private static int findMin(int[] arr){
        int low=0,high=arr.length-1;

        while (low<high){
            int mid =low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }
}
