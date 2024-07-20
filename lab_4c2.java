
import java.util.Scanner;

public class lab_4c2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		double avg = (double) sum / arr.length;

		System.out.println("Sum : " + sum);
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		System.out.println("Average : " + avg);
		sc.close();

	}
}
