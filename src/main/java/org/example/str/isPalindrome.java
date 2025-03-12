package org.example.str;

/**
 * 9. 回文数 Easy
 */
public class isPalindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);

        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    /**
     * Math: 除数和余数的使用
     * @param x
     * @return
     */
    public boolean isPalindromeInMath(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }

}
