import java.util.Arrays;

public class OddEvenReArrange {
    public static void main(String[] args){
        int[] arr={2,1,4,6,3,5,7};

        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0){
                left++;
            }else if(arr[right]%2==0){
                right--;
            }else {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println("Re-Arranged Array: "+ Arrays.toString(arr));
    }
}
