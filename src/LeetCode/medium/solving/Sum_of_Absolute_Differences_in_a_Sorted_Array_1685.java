package LeetCode.medium.solving;

/**
 * Date-11/25/2023
 * By Sardor Tokhirov
 * Time-12:28 AM (GMT+5)
 */
public class Sum_of_Absolute_Differences_in_a_Sorted_Array_1685 {
    public static void main(String[] args) {
        System.out.println(new Sum_of_Absolute_Differences_in_a_Sorted_Array_1685()
                .getSumAbsoluteDifferences(new int[]{2, 3, 5}));
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int k = n - nums[j];
                if (k < 0) k *= -1;
                sum[i] += k;
                sum[j] += k;
            }
        }
        return sum;
    }
}
