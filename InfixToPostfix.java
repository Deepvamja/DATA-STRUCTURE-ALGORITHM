
import java.util.Stack;

public class InfixToPostfix {

    
    public  static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

   
    public  static int precedence(char operator) {
        switch (operator) {
            case '+':
            case'-':
                return 1;
            case '*':
            case '/':
                return 2;
            case'^':
                return 3;
            default:
                return 0;
        }
    }

    
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        for (char c : infix.toCharArray()) {
            if (Character.isLetter(c)) {
                postfix.append(c); 
            } else if (c == '(') {
                // ( is added to stack
                stack.push(c); 
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()); 
                }
                stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop()); 
                }
                stack.push(c); 
            }
        }

        
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
