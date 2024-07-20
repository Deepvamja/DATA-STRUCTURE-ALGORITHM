import java.util.Scanner;

public class lab_4c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        char[] toggledChars = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLowerCase(ch)) {
                toggledChars[i] = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                toggledChars[i] = Character.toLowerCase(ch);
            } else {
                toggledChars[i] = ch;
            }
        }
        String toggledString = new String(toggledChars);
        System.out.println("Toggled case string: " + toggledString);
    }
}
