package org.example.simple.array;

public class majorityElement {

    public int majorityElement(int[] nums) {
        // Initialize count and candidate variables
        int count = 0;
        int candidate = 0;
        // Loop through the array
        for (int num : nums) {
            // If count is 0, set candidate to current number
            if (count == 0) {
                candidate = num;
            }
            // Increment count if current number is equal to candidate,
            // otherwise decrement count
            count += (num == candidate) ? 1 : -1;
        }
        // Return the candidate
        return candidate;
    }
}
