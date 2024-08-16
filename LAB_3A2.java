import java.util.Scanner;

public class LAB_3A2 {
    public static void main(String[] args) {
        int n;
        int m;
        double average = 0;
        int sum = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        n = sc.nextInt();
        System.out.println("enter the second element");
        m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            sum = sum + i;
            count++;

        }

        average = sum / count;

        System.out.println(average);

    }
}
