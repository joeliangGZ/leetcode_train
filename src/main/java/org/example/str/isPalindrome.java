package org.example.str;

public class isPalindrome {

    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Initialize two pointers, one at the start and one at the end of the string
        int i = 0, j = str.length() - 1;
        // Loop through the string until the two pointers meet in the middle
        while (i < j) {
            // If the characters at the two pointers are not equal, return false
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // Move the pointers closer together
            i++;
            j--;
        }
        // If the loop completes without finding any unequal characters, return true
        return true;
    }

    public static void main(String[] args) {
        isPalindrome isPalindrome = new isPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome.isPalindrome("race a car")); // false
    }
}
