public class largest {

    static public void largest1(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];

            }
        }
        System.out.println(largest);

    }

    public static void main(String[] args) {
        String fruits[] = { "bannana", "mango" };
        largest1(fruits);
    }

}
