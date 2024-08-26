
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive integer greater than 1: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int number) {
        // If number is less than or equal to 1, it's not prime
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 to half of number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Found a factor, so not prime
            }
        }

        return true; // No factors found, so prime
    }
}
