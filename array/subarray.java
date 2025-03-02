public class subarray {

    public static void subarr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= end; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);

                }
                System.out.println();

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 6, 7 };
        subarr(arr);
    }
}
