
import java.util.Scanner;

public class lab_6a {

    public static void swapNumbers(int a, int b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int num2 = scanner.nextInt();

        swapNumbers(num1, num2);

        scanner.close();
    }
}
