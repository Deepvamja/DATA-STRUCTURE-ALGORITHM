public class Main {
    public static void main(String[] args) {

        int n = 153;

        int temp = n;
        int count = 0;

        // Count number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = n;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, count);

            temp = temp / 10;
        }

        // Check result
        if (n == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
