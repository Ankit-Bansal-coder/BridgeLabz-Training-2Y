import java.util.Stack;

public class PostfixEvaluation {

    // Function to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If operand (digit), push to stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // convert char to int
            }
            // If operator, pop two operands and apply
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        // Final result
        return stack.pop();
    }

    // Driver code
    public static void main(String[] args) {
        String postfix = "231*+9-"; // equivalent to (2 + (3 * 1)) - 9
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Evaluation Result: " + evaluatePostfix(postfix));
    }
}