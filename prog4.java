// WAP to find whether a number is Odd or Even without using a % operator. 

//apporach

// Step 1  Read number n
// Step 2  Perform n & 1   // bitwise and  both 1 then only 1 else 0
// Step 3  If result = 0 → Even
// Step 4  If result = 1 → Odd

// Example

// Number	Binary
// 6	    110
// 7	    111
// 8	    1000

// Look at the last bit.

// Last Bit	Meaning
// 0	        Even
// 1	        Odd


// n = 6
// binary = 110
// 110
// 001
// ----
// 000

// Result

// 0

// so 6 is even

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}