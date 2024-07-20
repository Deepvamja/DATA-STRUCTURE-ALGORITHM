
import java.util.Scanner;

public class factors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("enter a valid number:");
        }

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("Factors of " + number + " are: ");

        scanner.close();
    }
}
