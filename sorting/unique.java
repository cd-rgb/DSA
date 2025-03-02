package sorting;

public class unique {
    public static void uniquearr(int arr[]) {
        int n = arr.length;
        int unique[] = new int[n];
        unique[0] = arr[0];
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j < i; j++) {
                if (arr[i] == unique[j]) {
                    break;
                } else {
                    unique[j + 1] = arr[i];
                }
            }
        }
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };
        uniquearr(arr);

    }
}