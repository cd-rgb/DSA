public class zero {
    public static void moveZeroes(int nums[]) {
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == 0) {
                for (int j = i; j <n-1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[n - 1] = 0;
            }
            

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 2, 4, 0, 3, 6, 0,8};
        moveZeroes(nums);
    }

}
