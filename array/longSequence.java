import java.util.*;;

public class longSequence {
    public static int longest(int[] nums) {
        int max = 1;
        int count = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] - 1) {
                count++;
            } else {
               
                count = 1;
            }
            max = Math.max(count, max);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 2, 6,101,3,102 };
        System.out.println(longest(nums));
    }

}
