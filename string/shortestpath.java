public class shortestpath {

    static public float shortestPath(String str) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x--;
            } else {
                x++;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }

    public static void main(String[] args) {
        String str = "WE";
        System.out.println(shortestPath(str));
    }
}
