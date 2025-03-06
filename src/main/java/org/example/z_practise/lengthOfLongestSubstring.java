package org.example.z_practise;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            while (set.contains(current)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);

        }
        return maxLength;
    }
}
