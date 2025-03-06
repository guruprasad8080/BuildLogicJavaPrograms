public class ArrayDuplicateElements {

    /*Sorted Array with removing duplicate changing the index.
    * O(1)->Space Complexity
    * O(n)-> Time complexity
    * */
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int n) {

        int uniqueIndx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[uniqueIndx] != arr[i]) {
                uniqueIndx++;
                arr[uniqueIndx] = arr[i];
            }
        }

        return uniqueIndx + 1;
    }

}
