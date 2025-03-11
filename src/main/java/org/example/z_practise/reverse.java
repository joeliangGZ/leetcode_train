package org.example.z_practise;

/**
 * @author lhh
 * @date 2025/3/11
 */
public class reverse {

    public int reverse(int x) {

        int signal = x < 0 ? -1 : 1;
        int n = Math.abs(x);

        String str = new StringBuilder().append(n).reverse().toString();
        try {
            int parseInt = Integer.parseInt(str);

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
        System.out.println(reverse.reverse(-123));
    }
}
