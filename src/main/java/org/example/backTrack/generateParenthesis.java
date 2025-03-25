package org.example.backTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成 Middle
 *
 * @author lhh
 * @date 2025/3/25
 */
public class generateParenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }

    private void backTrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backTrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backTrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> strings = new generateParenthesis().generateParenthesis(n);
        System.out.println(strings);
    }
}
