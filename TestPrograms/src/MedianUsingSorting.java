import java.util.Arrays;

public class MedianUsingSorting {
    public static void main(String[] args) {
        int[] A={1,3};
        int[] B={2,4};
        System.out.println(findMedianOfSorted(A,B));
    }

    private static double findMedianOfSorted(int[] a, int[] b){
        int[] c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        int len=c.length;
        if(len%2==0){
            return (c[len/2]);
        }

        return 0.0;
    }
}
