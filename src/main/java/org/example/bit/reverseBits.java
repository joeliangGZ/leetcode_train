package org.example.bit;

public class reverseBits {

    public int reverseBits(int n) {
        // Initialize the result to 0
        int result = 0;
        // Loop through 32 bits
        for (int i = 0; i < 32; i++) {
            // (result << 1) Shift the result to the left by 1 bit
            // (n & 1) get the n lowest bit
            // | (n & 1) add the n lowest bit to the result
            result = (result << 1) | (n & 1);
            // Shift the n to the right by 1 bit
            // to get the next lowest bit
            n >>= 1;
        }
        // Return the result
        return result;
    }

    public static void main(String[] args) {
        reverseBits r = new reverseBits();
        System.out.println(r.reverseBits(43261596));
    }


}
