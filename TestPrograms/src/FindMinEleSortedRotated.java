public class FindMinEleSortedRotated {
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
