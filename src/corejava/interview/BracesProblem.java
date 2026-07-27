package corejava.interview;

import java.util.Stack;

public class BracesProblem {

    public static void main(String[] args) {

        String s = "{)[](}";   // Change this input to test

        boolean isBalanced = isParenthesisBalanced(s);

        System.out.println("Is Balanced: " + isBalanced);
    }

    public static boolean isParenthesisBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Process closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if brackets match
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {

        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}