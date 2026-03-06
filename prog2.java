// WAP to find a summa on of a digit of a given number. (Iterative and recursive)

// iterative 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        while(n > 0){

            int digit = n % 10;

            sum = sum + digit;

            n = n / 10;

        }

        System.out.println(sum);
    }
}

// recursive

import java.util.Scanner;

public class Main {

    static int sumDigits(int n){

        if(n == 0)
            return 0;

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumDigits(n));
    }
}