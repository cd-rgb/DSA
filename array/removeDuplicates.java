public class removeDuplicates {
    public static void duplicates(int[] nums) {
        int num = nums.length;
        int j = 0;
        for (int i = 1; i < num; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

        }
        System.out.println(j);
        for (int i = 0; i <=j; i++) {
            System.out.print(nums[i]);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1,1,2};
        duplicates(nums);
    }

}
