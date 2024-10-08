
import java.io.*;

public class SelectSort {
    static void Sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            for (int j = i; j < n; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // SelectionSort ss = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        Sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
