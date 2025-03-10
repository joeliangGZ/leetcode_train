package org.example.str;

/**
 * 7.整数反转 Middle
 */
public class reverse {

    public int reverse(int x) {

        int signal = x < 0 ? -1 : 1;
        int n = Math.abs(x);

        String nstr = new StringBuilder(String.valueOf(n)).reverse().toString();
        try {
            int parseInt = Integer.parseInt(nstr);

            parseInt *= signal;

            if (parseInt < Integer.MIN_VALUE || parseInt > Integer.MAX_VALUE) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        reverse reverse = new reverse();
        int x = 120;
        System.out.println(reverse.reverse(x));
    }
}
