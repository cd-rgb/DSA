public class maxSubarray1 {

    public static int maxsubarr(int arr[]) {
        int prefixarr[] = new int[arr.length];
        prefixarr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixarr[i] = prefixarr[i - 1] + arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(prefixarr[i]);

        }
        int end = arr.length - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= end; j++) {
                int sum = 0;
                sum = i == 0 ? prefixarr[j] : prefixarr[j] - prefixarr[i - 1];
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }

            }

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        System.out.println(maxsubarr(arr));
    }
}
