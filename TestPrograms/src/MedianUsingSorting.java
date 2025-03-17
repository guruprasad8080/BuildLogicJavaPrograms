import java.util.Arrays;

public class MedianUsingSorting {
    class MedianOfTwoSortedArrays {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1); // Ensure binary search is on the smaller array
            }
            int x = nums1.length;
            int y = nums2.length;
            int low = 0, high = x;

            while (low <= high) {
                int partitionX = (low + high) / 2;
                int partitionY = (x + y + 1) / 2 - partitionX;

                int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
                int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

                int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
                int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

                if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                    // Found the correct partition
                    if ((x + y) % 2 == 0) {
                        return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                    } else {
                        return Math.max(maxLeftX, maxLeftY);
                    }
                } else if (maxLeftX > minRightY) {
                    high = partitionX - 1; // Move left
                } else {
                    low = partitionX + 1; // Move right
                }
            }
            throw new IllegalArgumentException("Input arrays are not sorted properly.");
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 3, 8};
            int[] nums2 = {7, 9, 10, 11};

            double median = findMedianSortedArrays(nums1, nums2);
            System.out.println("Median: " + median);
        }
    }

}
