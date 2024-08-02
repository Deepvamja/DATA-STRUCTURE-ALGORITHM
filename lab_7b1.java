import java.util.*;
import java.util.Stack;

public class lab_7b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Test Cases: ");
        int T = scanner.nextInt();
        scanner.nextLine(); 

        for (int t = 0; t < T; t++) {
            String input = scanner.nextLine().trim();
            if (isBalanced(input)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
