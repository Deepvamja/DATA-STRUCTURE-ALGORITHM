public class lab_7b {

    public static boolean isAibI(String str) {
        int countA = 0;
        int countB = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                if(countB!=0){
                    return false;
                }
                countA++;
            } else if (c == 'b') {
                countB++;
            }else{
                return false;
            }
        }

        return countA > 0 && countA == countB;
    }

    public static void main(String[] args) {
        String[] st = { "ab", "aabb", "aaabbb", "aaaabbbb", "a", "b", "aacbb" };


        for (String str : st) {
            boolean result = isAibI(str);
            if (result) {
                System.out.println("\"" + str + "\" is of the form a^i b^i.");
            } else {
                System.out.println("\"" + str + "\" is not of the form a^i b^i.");
            }
        }
    }
}
