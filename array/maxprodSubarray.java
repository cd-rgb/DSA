public class maxprodSubarray {
    public static int maxprod(int nums[]) {
        int max = Integer.MIN_VALUE;
        int prefix = 0;
        int suffix = 0;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, -1, 4, -6, 3, -2, 6 };
        System.out.println(maxprod(nums));
    }

}
