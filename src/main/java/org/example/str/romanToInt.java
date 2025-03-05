package org.example.str;

public class romanToInt {

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                result -= getValue(s.charAt(i));
            } else {
                result += getValue(s.charAt(i));
            }
        }
        return result;
    }

    private int getValue(char c) {
        //return switch (c) {
        //    case 'I' -> 1;
        //    case 'V' -> 5;
        //    case 'X' -> 10;
        //    case 'L' -> 50;
        //    case 'C' -> 100;
        //    case 'D' -> 500;
        //    case 'M' -> 1000;
        //    default -> 0;
        //};
        return 0;
    }
}
