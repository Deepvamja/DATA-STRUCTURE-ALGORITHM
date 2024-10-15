
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class lab_5b {

    public static boolean areAnagrams(String word1, String word2) {
        // Convert strings to char arrays and sort them
        char[] charArray1 = word1.toLowerCase().toCharArray();
        char[] charArray2 = word2.toLowerCase().toCharArray();

        // Sort arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: User input and array population
        System.out.print("Enter the number of words: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        // Step 2: Generate a random number between 0 to N-1
        int randomIndex = random.nextInt(N);

        // Step 3: Display the word at the random index and get user input for anagram
        String wordToGuess = words[randomIndex];
        System.out.println("Guess the anagram of: " + wordToGuess);
        System.out.print("Your guess: ");
        String userGuess = scanner.nextLine();

        // Step 4: Check if the user's guess is an anagram
        if (areAnagrams(wordToGuess, userGuess)) {
            System.out.println("Correct! It's an anagram.");
        } else {
            System.out.println("Incorrect. It's not an anagram.");
        }

        scanner.close();
    }
}
