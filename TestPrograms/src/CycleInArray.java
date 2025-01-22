public class CycleInArray {

    /*A cycle in an array refers to a sequence of elements in the array,
    where you repeatedly move to the next index as determined by the value at the current index.
    Eventually, you return to a previously visited index, forming a loop or cycle.
    *Ex: Starting from index i, jump forward or backward by the value at arr[i]
    *    If the array allows you to loop back to an earlier index, a cycle is formed.
    * Algorithm : Tortoise and Hare used.
    * */

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
