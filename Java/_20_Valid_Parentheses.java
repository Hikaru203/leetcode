package Java;

public class _20_Valid_Parentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false; // Odd length cannot be valid

        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c; // Push to stack
            } else {
                if (top == -1) return false; // Stack is empty, no matching opening bracket
                char last = stack[top--]; // Pop from stack
                if (!isMatchingPair(last, c)) return false; // Check for matching pair
            }
        }
        return top == -1; // Stack should be empty if all brackets are matched
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
