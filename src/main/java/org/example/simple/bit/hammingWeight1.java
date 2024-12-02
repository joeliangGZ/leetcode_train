package org.example.simple.bit;

public class hammingWeight1 {

    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            // test every bit from tail
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        hammingWeight1 hw = new hammingWeight1();
        System.out.println(hw.hammingWeight(6));
    }
}