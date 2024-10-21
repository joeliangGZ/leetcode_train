package org.example.simple;

import java.util.Stack;

public class isValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            // 第一个 char 不是括号开头的直接 false
            else
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid isValid = new isValid();
//        System.out.println(isValid.isValid("()"));
//        System.out.println(isValid.isValid("()[]{}"));
//        System.out.println(isValid.isValid("(]"));
//        System.out.println(isValid.isValid("([])"));
//        System.out.println(isValid.isValid(""));

        // 带有非括号的字符都会直接 false
        System.out.println(isValid.isValid("123"));
        System.out.println(isValid.isValid("(123"));
        System.out.println(isValid.isValid("({123})"));
    }
}
