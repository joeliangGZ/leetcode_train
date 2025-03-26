package org.example.z_practise;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        if (n <= 0) return result;

        backTrack(result, "", 0, 0, n);
        return result;
    }

    private void backTrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == 2 * max) {
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
}
