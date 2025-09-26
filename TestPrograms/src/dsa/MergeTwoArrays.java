package dsa;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        int[] merged=mergeArrays(arr1,arr2);
        System.out.println("Merged arrays");
        for (int val:merged){
            System.out.println(val+" ");
        }

        mergeWithoutThirdArray(arr1,arr2);
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        for (int val : arr2) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    //Merge Two arrays using the third array
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int n= arr1.length,m=arr2.length;
        int[] result= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                result[k++]=arr1[i++];
            }else{
                result[k++]=arr2[j++];
            }
        }
        while(i<n) result[k++]=arr1[i++];
        while(j<m) result[k++]=arr2[j++];
        return result;
    }

    //Merge two arrays without using the third array
    public static void mergeWithoutThirdArray(int[] arr1,int[] arr2){
        int n=arr1.length,m=arr2.length;
        for(int i=0;i<n;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                //ReArrange the second array
                int first =arr2[0];
                int k;
                for (k=1;k<m && arr2[k]<first;k++){
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=first;
            }
        }
    }

}
