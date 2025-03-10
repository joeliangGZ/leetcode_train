package org.example.str;

public class myAtoi {

    public int myAtoi(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            boolean a = isBlank(c);
            if (a) continue;

            boolean b = isSignal(c);
            if (b) sb.append(c);


        }
    }

    private boolean isSignal(char c) {
        return c == 43 || c == 45;
    }

    private boolean isBlank(char c) {
        return c == 32;
    }
}
