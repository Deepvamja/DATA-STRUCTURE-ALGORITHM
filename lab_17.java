import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HashingWithLinearProbing {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 20;
        final int NUM_VALUES = 15;
        int[] hashTable = new int[ARRAY_SIZE];
        boolean[] isOccupied = new boolean[ARRAY_SIZE]; // To track occupied slots
        HashSet<Integer> generatedValues = new HashSet<>();

        Random random = new Random();
        
        // Generate 15 unique random values
        while (generatedValues.size() < NUM_VALUES) {
            int value = 100000 + random.nextInt(900000); // Generates number in range 100000 to 999999
            generatedValues.add(value);
        }

        // Convert HashSet to array
        Integer[] valuesArray = generatedValues.toArray(new Integer[0]);

        // Insert values into the hash table using linear probing
        for (int value : valuesArray) {
            int key = hashFunction(value);
            while (isOccupied[key]) {
                key = (key + 1) % ARRAY_SIZE; // Linear probing
            }
            hashTable[key] = value;
            isOccupied[key] = true;
        }

        // Display the final values in the hash table
        System.out.println("Final values in the hash table:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (isOccupied[i]) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            } else {
                System.out.println("Index " + i + ": [Empty]");
            }
        }
    }

    // Hash function
    private static int hashFunction(int x) {
        return (x % 18) + 2; // H(x) = (x mod 18) + 2
    }
}
