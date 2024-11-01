package org.example.simple;

public class merge {

    // This method merges two sorted arrays into one sorted array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2 and the merged array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        // Loop through both arrays and compare elements
        while (i >= 0 && j >= 0) {
            // If element in nums1 is greater than element in nums2, add it to the merged array
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            // Otherwise, add element in nums2 to the merged array
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // If there are any remaining elements in nums2, add them to the merged array
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        merge merge = new merge();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
