package org.example.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lhh
 * @date 2024/10/28
 */
public class findSubstring {

    // This method finds all occurrences of a substring in a string
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        // Get the length of each word and the total number of words
        int wordLength = words[0].length();
        int totalWords = words.length;
        int totalLength = wordLength * totalWords;

        // If the length of the string is less than the total length of the words, return an empty list
        if (s.length() < totalLength) {
            return result;
        }

        // Create a map to store the count of each word in the words array
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Iterate through the string to find all occurrences of the substring
        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j;
            for (j = 0; j < totalWords; j++) {
                String currentWord = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                // If the current word is not in the wordCount map, break the loop
                if (!wordCount.containsKey(currentWord)) {
                    break;
                }
                // Add the current word to the seen map
                seen.put(currentWord, seen.getOrDefault(currentWord, 0) + 1);
                // If the count of the current word in the seen map is greater than the count in the wordCount map, break the loop
                if (seen.get(currentWord) > wordCount.get(currentWord)) {
                    break;
                }
            }
            // If all words are found, add the starting index to the result list
            if (j == totalWords) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = findSubstring(s, words);
        System.out.println(result);  // Output: [0, 9]
    }
}