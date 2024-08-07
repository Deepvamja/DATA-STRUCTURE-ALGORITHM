
import java.util.Arrays;

class BubbleSort {

    static void bubbleSort(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++)

            for (int j = 0; j < n - i - 1; j++)

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String args[]) {

        int[] data = { 64, 25, 12, 22, 11 };

        BubbleSort.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
