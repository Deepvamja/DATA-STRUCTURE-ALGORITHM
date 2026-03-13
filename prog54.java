import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String St = "madam";
    int left=0;
    int right = St.length()-1;

    boolean palindrome = true;

    while(left<right){

        if(St.charAt(left) != St.charAt(right)){
            palindrome = false;
            break;
    }
    left++;
    right--;
    }
       if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}