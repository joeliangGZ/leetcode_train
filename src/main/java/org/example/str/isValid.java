package org.example.str;

import java.util.Stack;

/**
 * 20. 有效的括号 Easy
 */
public class isValid {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

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
