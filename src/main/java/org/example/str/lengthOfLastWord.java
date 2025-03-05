package org.example.str;

/**
 * @author lhh
 * @date 2024/10/29
 */
public class lengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        // Initialize the length of the last word to 0
        int len = 0;
        // Loop through the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            // If the character is a space
            if (s.charAt(i) == ' ') {
                // If the length of the last word is 0, continue to the next character
                if (len == 0) {
                    continue;
                    // If the length of the last word is not 0, break the loop
                } else {
                    break;
                }
            }
            // Increment the length of the last word
            len++;
        }
        // Return the length of the last word
        return len;
    }

    public static void main(String[] args) {

        // Test case 1: Normal case with multiple words
        assert lengthOfLastWord("Hello World") == 5;

        // Test case 2: String with trailing spaces
        assert lengthOfLastWord("Hello World   ") == 5;

        // Test case 3: String with leading spaces
        assert lengthOfLastWord("   Hello World") == 5;

        // Test case 4: Single word in the string
        assert lengthOfLastWord("Hello") == 5;

        // Test case 5: Empty string
        assert lengthOfLastWord("") == 0;

        // Test case 6: String with only spaces
        assert lengthOfLastWord("     ") == 0;

        // Test case 7: String with multiple spaces between words
        assert lengthOfLastWord("Hello   World") == 5;

        System.out.println("All test cases pass");
    }


}
