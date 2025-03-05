package org.example.array;

public class singleNumber {

    // This method takes an array of integers as input and returns the single number that appears only once in the array
    public int singleNumber(int[] nums) {
        // Initialize a variable to store the result
        int result = 0;
        // Iterate through the array of integers
        for (int num : nums) {
            // Use the XOR operator to find the single number
            result ^= num;
        }
        // Return the single number
        return result;
    }

    public static void main(String[] args) {
        singleNumber obj = new singleNumber();
        int[] nums = {2,2,1};
        System.out.println(obj.singleNumber(nums));
    }
}