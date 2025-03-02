import java.util.*;;

public class nextPermutation {
    public static List<Integer> nextGreaterPermutation(List<Integer> nums) {
        int n = nums.size();
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                index = i;
                break;

            }
        }
        if (index == -1) {
            Collections.reverse(nums);
            return nums;
        }
        for (int i = n - 1; i > index; i--) {
            if (nums.get(i) > nums.get(index)) {
                Collections.swap(nums, index, i);
                break;
            }
        }
        List<Integer> sublist = nums.subList(index + 1, n);
        Collections.reverse(sublist);
        return nums;

    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 1, 5, 4, 3, 0, 0);
        List<Integer> res = nextGreaterPermutation(nums);
        System.out.print("The next permutation is: [");
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println("]");
    }

}
