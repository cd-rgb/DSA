import java.util.*;

public class compression {
    public static void compression1(String str) {

        String sb = new String(" ");
        for (int i = 0; i < str.length() - 1; i++) {
            int count = 0;
            while (i < str.length() - 1) {
                sb += str.charAt(i);

                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }

            }
            sb += count;

        }
        for (int j = 0; j < sb.length(); j++) {

            System.out.print(sb.charAt(j));

        }
    }

    public static void main(String[] args) {
        String str = "aaabbbbb";
        compression1(str);

    }
}
