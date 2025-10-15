import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
       int arr1[] = {1, 2, 0, 4, 3, 0, 5, 0};
       int arr2[] = {1, 3, 0, 4, 9, 0, 5, 0};
        System.out.println("Normal Approach");
        normalApproach(arr1);
        System.out.println("Two Pinter Approach");
        twoPointerApproach(arr2);

    }

    static void normalApproach(int[] arr){
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex++]=arr[i];
            }
        }
        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex++]=0;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void twoPointerApproach(int[] arr){
          int left=0;  // to point placing non-zero elements
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;  //to move the pointer forward.
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
