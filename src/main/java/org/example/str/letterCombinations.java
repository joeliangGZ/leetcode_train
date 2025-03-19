package org.example.str;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 17. 电话号码的字母组合 Middle
 */
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
            "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backTrack(new StringBuilder(), result, digits, 0);
        return result;
    }

    private void backTrack(StringBuilder current, List<String> result, String digits, int index) {
        if (current.length() == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backTrack(current, result, digits,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }


    public List<String> letterCombinationsNormal(String digits) {

        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }

        Map<Character, String> charsMap = new HashMap<>();
        charsMap.put('2', "abc");
        charsMap.put('3', "def");
        charsMap.put('4', "ghi");
        charsMap.put('5', "jkl");
        charsMap.put('6', "mno");
        charsMap.put('7', "pqrs");
        charsMap.put('8', "tuv");
        charsMap.put('9', "wxyz");

        Map<Integer, List<String>> combines = new HashMap<>();

        for (int i = 0; i < digits.length(); i++) {

            List<String> currStrs = Arrays.asList(charsMap.get(digits.charAt(i)).split(""));
            List<String> preStrs;
            if (i == 0) {
                preStrs = Arrays.asList(charsMap.get(digits.charAt(i)).split(""));
                combines.put(i, preStrs);
                continue;
            } else {
                preStrs = combines.get(i-1);
            }

            List<String> combine = preStrs.stream()
                    .flatMap(preStr -> currStrs.stream().map(currStr -> preStr + currStr))
                    .collect(Collectors.toList());

            combines.put(i, combine);
        }

        return combines.get(digits.length() - 1);
    }
}
