package org.example.array;

/**
 * @author lhh
 * @date 2024/10/22
 */
public class removeElement {

    // This method removes all instances of a specified value from an array and returns the new length of the array
    public int removeElement(int[] nums, int val) {
        int i = 0;
        // Loop through the array
        for (int j = 0; j < nums.length; j++) {
            // If the current element is not equal to the specified value
            if (nums[j] != val) {
                // Assign the current element to the i-th position in the array
                nums[i] = nums[j];
                // Increment i
                i++;
            }
        }
        // Return the new length of the array
        return i;
    }

    public static void main(String[] args) {

        removeElement removeElement = new removeElement();

        // Test case 1: Element to be removed exists in the array
        assert removeElement.removeElement(new int[]{3, 2, 2, 3}, 3) == 2;

        // Test case 2: Element to be removed does not exist in the array
        assert removeElement.removeElement(new int[]{1, 2, 3, 4}, 5) == 4;

        // Test case 3: Array contains only one type of element
        assert removeElement.removeElement(new int[]{2, 2, 2, 2}, 2) == 0;

        // Test case 4: Array contains no elements
        assert removeElement.removeElement(new int[]{}, 1) == 0;

        // Test case 5: Array contains one element which is the one to be removed
        assert removeElement.removeElement(new int[]{1}, 1) == 0;

        // Test case 6: Array contains one element which is not the one to be removed
        assert removeElement.removeElement(new int[]{1}, 2) == 1;

        System.out.println("All test cases pass");
    }

}