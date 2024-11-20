package org.example.simple.str;

/**
 * @author lhh
 * @date 2024/10/22
 */
public class strStr {

    // This method returns the index of the first occurrence of the needle in the haystack,
    // or -1 if the needle is not found
    public int strStr(String haystack, String needle) {
        // If the needle is an empty string, return 0
        if (needle.length() == 0) {
            return 0;
        }
        // Get the length of the haystack and needle
        int n = haystack.length(), m = needle.length();
        // Loop through the haystack
        for (int i = 0; i <= n - m; i++) {
            // Loop through the needle
            int j;
            for (j = 0; j < m; j++) {
                // If the characters at the current position in the haystack and needle do not match,
                // break the loop
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // If the entire needle has been found in the haystack,
            // return the index of the first character
            if (j == m) {
                return i;
            }
        }
        // If the needle is not found in the haystack, return -1
        return -1;
    }
}