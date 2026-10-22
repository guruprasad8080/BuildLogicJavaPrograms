import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a={1,3,5,7};
        int[] b={2,4,6,8};

        int n=a.length;
        int m=b.length;
        int[] result=new int[n+m];
        int i=0,j=0,k=0;

        while(i<n&&j<m){
            if(a[i]<=b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[j++];
            }
        }

        while(i<n){
            result[k++]=a[i++];
        }
        while(j<m){
            result[k++]=b[j++];
        }

        System.out.println(Arrays.toString(result));
    }
}
