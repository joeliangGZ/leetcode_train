package org.example.z_practise;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {

    private static final String[] KEYS = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backTrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backTrack(List<String> result, StringBuilder current,
                           String digits, int index) {

        if (current.length() == digits.length()) {
            result.add(current.toString());
            return;
        }

        // '23' - 'abc'
        String letters = KEYS[digits.charAt(index) - '0'];
        // a b c
        for (char c : letters.toCharArray()) {
            current.append(c);
            // d e f
            backTrack(result, current, digits, index+1);
            // 2-1=1 so a -> b for loop
            current.deleteCharAt(current.length()-1);
        }
    }
}
