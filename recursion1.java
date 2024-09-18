import java.util.Scanner;

public class recursion1 {

    static int recursion(int n) {
        if (n == 1) {
            return 1;

        }
        return n * recursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = recursion(n);
        System.out.println(ans);

        sc.close();
        

    }
    

}

