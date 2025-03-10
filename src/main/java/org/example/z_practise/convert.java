package org.example.z_practise;

public class convert {

    public String convert(String s, int numRows) {

        if (s.length() == 1 || s.length() == numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {

            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
            sb.append(row);
        }

        return sb.toString();
    }
}
