import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("no is odd");
        }
        sc.close();

    }
}