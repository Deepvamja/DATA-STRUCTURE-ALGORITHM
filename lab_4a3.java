
import java.util.Scanner;

public class lab_4a3 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array:");
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n + 1];
        System.out.println("enter the values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter the elements you want to insert:");
        m = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < m) {
                b[i] = a[i];
            } else if (a[i] >= m) {
                b[i] = m;
                temp = i;
                break;
            }
            temp = i;

        }
        if (temp == n - 1) {
            b[n] = m;
        } else {
            for (int i = temp + 1; i < n + 1; i++) {
                b[i] = a[i - 1];

            }

        }

        System.out.println("elements are:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }

    }
}
