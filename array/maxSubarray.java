import java.util.*;
//brute force approach O(N^3)
public class maxSubarray {
    public static int maxsubarr(int arr[]) {
        int end = arr.length - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= end; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {

                    sum += arr[k];

                }
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }

            }

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 6, 7 };
        System.out.println(maxsubarr(arr));
    }

}
