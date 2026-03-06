
// WAP to find a factorial of a given integer (iterayive and recursive) 

// iterative code 

import java.util.Scanner;

public class prog1{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;

        for (int i=1; i<=n; i++){

            fact = fact * i;
        }
        System.out.println(fact);
    }
}


// recursive code 



import java.util.Scanner;

public class FactorialRecursive {

    static int factorial(int n) {

        if(n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}


