package org.example.z_practise;

public class myAtoi {

    public int myAtoi(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0, signal = 1, n = s.length(), result = 0;

        // skip blank
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // fetch signal
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            signal = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        // fetch number
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return signal == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        result *= signal;
        return result;
    }

    public static void main(String[] args) {
        String s = "0-1";
        myAtoi myAtoi = new myAtoi();
        System.out.println(myAtoi.myAtoi(s));
    }
}
