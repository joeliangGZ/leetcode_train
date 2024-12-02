package org.example.simple.bit;

public class hammingWeight {

    // This method calculates the number of 1s in the binary
    // representation of an integer
    public int hammingWeight(int n) {
        // Initialize a variable to store the count of 1s
        int count = 0;
        // Loop through the bits of the integer
        while (n != 0) {
            // If the least significant bit is 1, increment the count
            count += n & 1;
            // Right shift the bits of the integer
            n >>>= 1;
        }
        // Return the count of 1s
        return count;
    }

    public static void main(String[] args) {
        hammingWeight hw = new hammingWeight();
        System.out.println(hw.hammingWeight(11));
    }
}