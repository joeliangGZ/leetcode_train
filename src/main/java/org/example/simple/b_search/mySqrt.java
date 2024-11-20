package org.example.simple.b_search;

public class mySqrt {

    public static int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = mySqrt(8);
        System.out.println(result);
    }

//    public static void main(String[] args) {
//
//        // Test case 1: Perfect square number
//        assert mySqrt(4) == 2;
//
//        // Test case 2: Non-perfect square number
//        assert mySqrt(5) == 2;
//
//        // Test case 3: Zero as input
//        assert mySqrt(0) == 0;
//
//        // Test case 4: Negative number as input
//        assert mySqrt(-4) == -1;
//
//        // Test case 5: Large number as input
//        assert mySqrt(2147395599) == 46339;
//
//        System.out.println("All test cases pass");
//    }


}
