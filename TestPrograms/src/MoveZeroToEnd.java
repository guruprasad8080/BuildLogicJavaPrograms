import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
       int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
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
}
