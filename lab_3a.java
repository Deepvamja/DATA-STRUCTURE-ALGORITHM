import java.util.Scanner;

public class lab_3a {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array element");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }

}
