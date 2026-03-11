import java.util.Scanner;

class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);


        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int original = number;
        int digits = 0;

        int temp = number;

        while(temp > 0){
            digits++;
            temp = temp/10;
        }
        int sum =0;
        temp = number;

        while(temp>0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}