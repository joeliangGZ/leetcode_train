package org.example.str;

import java.util.HashSet;
import java.util.Set;

/**
 * 3 - 无重复字符的最长子串 Middle
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        for(int end = 0; end < s.length(); end++) {

            char current = s.charAt(end);
            while (set.contains(current)) {
                set.remove(s.charAt(start));
                start ++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring lengthOfLongestSubstring = new lengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
}
