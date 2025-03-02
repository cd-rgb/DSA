import java.util.*;

public class trappingRainwater {
    public static int waterStored(int arr[]) {
        int n = arr.length;
        // calulate left max arr
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int waterStored = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterHeight = Math.min(rightMax[i], leftMax[i]);
            waterStored += (waterHeight - arr[i]) * 1;
        }
        return waterStored;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(waterStored(arr));
    }

}
