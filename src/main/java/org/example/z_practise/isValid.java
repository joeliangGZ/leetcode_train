package org.example.z_practise;

import java.util.Stack;

/**
 * @author lhh
 * @date 2025/3/25
 */
public class isValid {

    public boolean isValid(String s) {

        if (s == null || s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
