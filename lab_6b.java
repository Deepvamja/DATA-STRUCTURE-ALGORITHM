
import java.util.Scanner;

public class lab_6b {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit of temperature (C/F): ");
        String unit = scanner.next();

        switch (unit.toUpperCase()) {
            case "C":
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println(temperature);
                break;
            case "F":
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println();
                break;
            default:
                System.out.println("Invalid unit entered. Please enter C or F.");
                break;
        }

        scanner.close();
    }
}
