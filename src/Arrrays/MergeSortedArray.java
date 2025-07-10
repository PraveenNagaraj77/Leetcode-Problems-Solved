package Arrrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // Last element in nums1's actual data
        int j = n - 1;       // Last element in nums2
        int k = m + n - 1;   // Last position in nums1 (with 0 buffer)

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements are left in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    // Optional: main method to test
    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        merger.merge(nums1, m, nums2, n);

        // Print result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: 1 2 2 3 5 6
    }
}
