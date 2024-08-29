
import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent from the user
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Validate that exponent is non-negative
        if (exponent < 0) {
            System.out.println("Exponent must be a non-negative integer.");
        } else {
            // Calculate power using a loop
            long result = 1; // Initialize result to 1
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            // Print the result
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }

        scanner.close();
    }
}
