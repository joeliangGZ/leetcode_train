package org.example.simple.str;

public class titleToNumber {

    public int titleToNumber(String columnTitle) {
        // Initialize the result to 0
        int res = 0;
        // Loop through each character in the columnTitle string
        for (char c : columnTitle.toCharArray()) {
            // Multiply the result by 26 and add the value of the character minus 'A' plus 1
            res = res * 26 + (c - 'A' + 1);
        }
        // Return the result
        return res;
    }

    public static void main(String[] args) {
        titleToNumber t = new titleToNumber();
        System.out.println(t.titleToNumber("ZY"));
    }
}
