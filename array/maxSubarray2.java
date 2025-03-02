import java.util.*;

//kadanes algo with linear time complexity O(n)
public class maxSubarray2 {
    public static int maxsubarr(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int subStart = 0;
        int ansEnd = 0;
        int ansStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                subStart = i;
            }

            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
                ansStart = subStart;
                ansEnd = i;
            }

        }
        System.out.println(ansStart);
        System.out.println(ansEnd);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -6 };
        System.out.println(maxsubarr(arr));
    }
}