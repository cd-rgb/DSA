public class palindrome {

    static public void palindrome1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("string is palindrome");
    }

    public static void main(String[] args) {
        String str = "madam";
        palindrome1(str);
    }

}
