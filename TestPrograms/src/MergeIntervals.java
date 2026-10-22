import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    /*  input = {(-3,-1),(1,3),(4,6),(16,32)}
        merge interval={(2,10)}
        after merging interval = {(-3,-1),(1,10),(16,32)}
    * */

    public static int[][] mergeIntervals(int[][] intervals,int[] newInterval){
        List<int[]> resultlist=new ArrayList<>();
        int i=0;
        int n=intervals.length;

        // Step 1: Add intervals that end before the new interval starts
        while(i<n && intervals[i][1]<=newInterval[0]){
            resultlist.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while(i<n&&intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        resultlist.add(newInterval);

        // Step 3: Add remaining intervals
        while(i<n){
            resultlist.add(intervals[i]);
            i++;
        }

        // Convert the list to an array and return
        return resultlist.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{-3,-1},{1,3},{4,6},{16,32}};
        int[] mergeInterval = {2,10};
        int[][] result = mergeIntervals(intervals,mergeInterval);


        System.out.print("After merging interval = {");

        for (int i = 0; i < result.length; i++) {
            System.out.print("(" + result[i][0] + "," + result[i][1] + ")");
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("}");
    }


}
