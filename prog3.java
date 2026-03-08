// WAP to find a total odd and total even digit of a given number. 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int odd = 0;
        int even = 0;

        while(n > 0){

            int digit = n % 10;

            if(digit % 2 == 0)
                even++;
            else
                odd++;

            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }
}