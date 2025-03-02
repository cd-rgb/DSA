public class toUppercase {

    static public void firstUpper(String str) {
        StringBuilder sb = new StringBuilder("");
        Character ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));

        for (int i = 1; i < str.length(); i++) {

            Character ans = str.charAt(i - 1);
            if (ans == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(sb.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "i am a good student";
        firstUpper(str);

    }

}
