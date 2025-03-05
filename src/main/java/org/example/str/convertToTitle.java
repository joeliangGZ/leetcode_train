package org.example.str;

public class convertToTitle {

    public String convertToTitle(int columnNumber) {
        // Create a StringBuilder to store the result
        StringBuilder sb = new StringBuilder();
        // Loop until the columnNumber is greater than 0
        while (columnNumber > 0) {
            // Decrement the columnNumber by 1
            columnNumber--;
            // Calculate the character to be added to the StringBuilder
            char c = (char) ('A' + (columnNumber % 26));
            // Insert the character at the beginning of the StringBuilder
            sb.insert(0, c);
            // Divide the columnNumber by 26 to get the next character
            columnNumber /= 26;
        }
        // Return the result as a string
        return sb.toString();
    }

    public static void main(String[] args) {
        convertToTitle convertToTitle = new convertToTitle();
        System.out.println(convertToTitle.convertToTitle(701));
    }

}
