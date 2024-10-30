package org.example.others;

/**
 * @author lhh
 * @date 2024/10/22
 */
public class KMP {

    // This method searches for a pattern in a text using the KMP algorithm
    public static void KMPSearch(String text, String pattern) {
        int M = pattern.length();  // Length of the pattern
        int N = text.length();  // Length of the text
        int[] pi = computePrefixFunction(pattern);  // Compute the prefix function for the pattern

        int q = 0;  // index for pattern
        for (int i = 0; i < N; i++) {
            // If the current character in the text does not match the current character in the pattern
            while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
                q = pi[q-1];  // Move the index of the pattern back to the position before the mismatch
            }
            // If the current character in the text matches the current character in the pattern
            if (pattern.charAt(q) == text.charAt(i)) {
                q++;  // Move the index of the pattern forward
            }
            // If the entire pattern has been matched
            if (q == M) {
                System.out.println("Found pattern at index " + (i - M + 1));  // Print the index where the pattern was found
                q = pi[q-1];  // Move the index of the pattern back to the position before the mismatch
            }
        }
    }

    // This method computes the prefix function for a pattern
    public static int[] computePrefixFunction(String pattern) {
        int m = pattern.length();  // Length of the pattern
        int[] pi = new int[m];  // Array to store the prefix function
        pi[0] = 0;  // The prefix function of the first character is 0
        int k = 0;  // Index for the prefix function
        for (int q = 1; q < m; q++) {
            // If the current character in the pattern does not match the character at the index k
            while (k > 0 && pattern.charAt(k) != pattern.charAt(q)) {
                k = pi[k-1];  // Move the index of the prefix function back to the position before the mismatch
            }
            // If the current character in the pattern matches the character at the index k
            if (pattern.charAt(k) == pattern.charAt(q)) {
                k++;  // Move the index of the prefix function forward
            }
            pi[q] = k;  // Store the prefix function at the current index
        }
        return pi;  // Return the prefix function
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";  // Text to search in
        String pattern = "ABABCABAB";  // Pattern to search for
        KMPSearch(text, pattern);  // Call the KMPSearch method
    }
}