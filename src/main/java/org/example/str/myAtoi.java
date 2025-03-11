package org.example.str;

/**
 * 8.字符串转换整数 (atoi) Middle
 */
public class myAtoi {

    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0, signal = 1, result = 0;
        int n = s.length();
        // skip blank
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // handle signal
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            signal = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        // handle digit
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return signal == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return result * signal;
    }

    public static void main(String[] args) {
        myAtoi myAtoi = new myAtoi();
        System.out.println(myAtoi.myAtoi("words and 987"));
    }
}
