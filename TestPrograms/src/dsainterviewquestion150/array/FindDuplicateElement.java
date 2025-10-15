package dsainterviewquestion150.array;

import java.util.HashSet;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 3,6};
        System.out.println("Duplicate element is: " + findDuplicate(arr));
        findDuplicates(arr);
    }

    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    static void findDuplicates(int[] arr){
        HashSet<Integer> unigue=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for(int num:arr){
            if(!unigue.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("Duplicate elements are: "+duplicate);
    }
}