package LeetCode.easy.solving;

/**
 * Date-7/25/2023
 * Time-11:50 PM
 */
public class Move_Zeroes_283 {
    public static void main(String[] args) {
        System.out.println(new Move_Zeroes_283().moveZeroes(new int[]{1, 0, 0, 1}));
    }

    public int[] moveZeroes(int[] nums) {
        int i = 0, k = 0, lasNumIndex = (nums.length - 1);
        while (lasNumIndex>k) {
            if (nums[i] == 0) {
                if (lasNumIndex > i) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                    i++;
                } else {
                    i = k;
                    lasNumIndex--;
                }
            } else {
                k++;
                i = k;
            }

        }
        return nums;
    }
}
