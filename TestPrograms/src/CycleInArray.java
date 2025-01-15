public class CycleInArray {

    public static void main(String[] args){
        int[] arr={1,2,1,2,5};
        int startIndex=0;
        if(detectCycle(arr,startIndex)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean detectCycle(int[] arr,int startIndex){
        int slow=startIndex;
        int fast=startIndex;
        int steps=0;
        do{
            if(fast>=arr.length||arr[fast]>=arr.length){
                return false;
            }
            slow=arr[slow];
            fast=arr[arr[fast]];
            steps++;
        }while(slow!=fast);
        int cycleLength=0;
        do{
            slow=arr[slow];
            cycleLength++;
        }while(slow!=fast);
        System.out.println("Cycle Detected with length: "+ cycleLength);
        System.out.println("Steps to complete the cycle: "+ steps);
        return true;
    }
}
