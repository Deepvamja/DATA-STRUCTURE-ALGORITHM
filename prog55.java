import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        List<String> list = new ArrayList<>();

        permute(str, "", list);

        Collections.sort(list);

        int index = list.indexOf(str);

        if(index + 1 < list.size())
            System.out.println(list.get(index + 1));
        else
            System.out.println("No next string");
    }

    static void permute(String str, String ans, List<String> list) {

        if(str.length() == 0) {
            list.add(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String rest = left + right;

            permute(rest, ans + ch, list);
        }
    }
}


prog