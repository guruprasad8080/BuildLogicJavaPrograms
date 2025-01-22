public class HighestRepeatedInteger {
    /* Highest Repeated in Sorted array
    * */
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,4,4,4,4,5,5,5};

        int repeat=0;
        int curCount=1;
        int maxCount=1;
        int mostFreqEle=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] == arr[i - 1]) {
                curCount++;

            } else {
                if (curCount > maxCount) {
                    maxCount = curCount;
                    mostFreqEle = arr[i - 1];
                }
                curCount = 1;
            }
        }
        if(curCount>maxCount){
            maxCount=curCount;
            mostFreqEle=arr[arr.length-1];
        }
        System.out.println("HigestRepeated: "+ mostFreqEle);


    }
}
