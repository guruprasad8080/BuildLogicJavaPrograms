public class FindSecondMinEleSortedRotatedArray {
    public static void main(String[] args){
        int[] arr={5,6, 7, 8, 1, 2,9, 3, 4};
        System.out.println("Result: "+findMin(arr));
    }

    private static int findMin(int[] arr) {
        int low=0,high=arr.length-1;
        int n=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else {
                high = mid;
            }
        }
       int minIndex=low;
       int secondSmallestIndex=(minIndex+1)%n;
       if(minIndex-1>=0&&arr[minIndex-1]<arr[secondSmallestIndex]){
           secondSmallestIndex=minIndex-1;
       }
        return arr[secondSmallestIndex];
    }

}
