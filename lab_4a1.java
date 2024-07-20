import java.util.Scanner;

public class lab_4a1 {
    public static void main(String[] args) {
        int n;
        int m;
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("enter the values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("elements index to be inserted at:");
        m = sc.nextInt();
        System.out.println("enter the no you want to insert:");
        p = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i - 1];
            }
        }
        System.out.println("elements are:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }
        sc.close();

    }

}
