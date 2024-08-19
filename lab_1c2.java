
import java.util.Scanner;

public class lab_1c2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            int partialSum = 0;
            for (int j = 1; j <= i; j++) {
                partialSum += j;
            }
            totalSum += partialSum;
        }
        System.out.println("The sum of the series is: " + totalSum);
        sc.close();
    }
}
