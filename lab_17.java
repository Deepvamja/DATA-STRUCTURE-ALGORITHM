import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HashingWithLinearProbing {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 20;
        final int NUM_VALUES = 15;
        int[] hashTable = new int[ARRAY_SIZE];
        boolean[] isOccupied = new boolean[ARRAY_SIZE]; 
        HashSet<Integer> generatedValues = new HashSet<>();

        Random random = new Random();
        
        
        while (generatedValues.size() < NUM_VALUES) {
            int value = 100000 + random.nextInt(900000); 
            generatedValues.add(value);
        }

       
        Integer[] valuesArray = generatedValues.toArray(new Integer[0]);

        for (int value : valuesArray) {
            int key = hashFunction(value);
            while (isOccupied[key]) {
                key = (key + 1) % ARRAY_SIZE; 
            }
            hashTable[key] = value;
            isOccupied[key] = true;
        }

 
        System.out.println("Final values in the hash table:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (isOccupied[i]) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            } else {
                System.out.println("Index " + i + ": [Empty]");
            }
        }
    }

   
    private static int hashFunction(int x) {
        return (x % 18) + 2; // H(x) = (x mod 18) + 2
    }
}
