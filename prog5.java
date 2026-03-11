// Wap to Find prime numbers between a range entered by user


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++) {

            boolean prime = true;

            if(i <= 1)
                prime = false;

            for(int j = 2; j <= Math.sqrt(i); j++) {

                if(i % j == 0) {
                    prime = false;
                    break;
                }

            }

            if(prime)
                System.out.print(i + " ");
        }
    }
}






// easier 



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++) {

            boolean prime = true;

            for(int j = 2; j < i; j++) {

                if(i % j == 0) {
                    prime = false;
                }

            }

            if(prime && i > 1) {
                System.out.print(i + " ");
            }

        }
    }
}