import java.util.Stack;

public class DuplicateParentheses {

    public static boolean hasDuplicateParentheses(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == ')') {
                int elementsInside = 0;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    elementsInside++;
                }

                // Pop the opening '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // If there were less than 1 element inside (), it's duplicate
                if (elementsInside <= 1) {
                    return true;
                }

            } else {
                // Push everything except ')'
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String expr1 = "((a+b))";        // Duplicate
        String expr2 = "(a+(b)/c)";      // No Duplicate
        String expr3 = "(a+b*(c-d))";    // No Duplicate
        String expr4 = "((a))";          // Duplicate

        System.out.println(expr1 + " -> " + hasDuplicateParentheses(expr1));  // true
        System.out.println(expr2 + " -> " + hasDuplicateParentheses(expr2));  // false
        System.out.println(expr3 + " -> " + hasDuplicateParentheses(expr3));  // false
        System.out.println(expr4 + " -> " + hasDuplicateParentheses(expr4));  // true
    }
}

