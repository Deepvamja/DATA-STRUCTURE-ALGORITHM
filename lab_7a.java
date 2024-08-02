public class lab_7a {

    public static boolean isPalindrome(String str) {
        int C = 0;
        int right = str.length() - 1;

        while (C < right) {
            if (str.charAt(C) != str.charAt(right)) {
                return false;
            }
            C++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] sc = { "aca", "bcb", "abcba", "acba" };

        for (String str : sc) {
            boolean result = isPalindrome(str);
            if (result) {
                System.out.println("" + str + "\" is a palindrome.");
            } else {
                System.out.println("\"" + str + "\" is not a palindrome.");
            }
        }
    }
}
