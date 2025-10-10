package dsainterviewquestion150.array;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
