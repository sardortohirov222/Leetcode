package LeetCode.medium.solving;

/**
 * Date-7/20/2023
 * Time-11:35 PM
 */
public class Number_of_Longest_Increasing_Subsequence_673 {
    public static void main(String[] args) {
        System.out.println(new Number_of_Longest_Increasing_Subsequence_673()
                .findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
    }

    public int findNumberOfLIS(int[] nums) {
        int number = 0;
        int min = Integer.MIN_VALUE;
        int maxAmount = 0;
        int demoAmount = 0;
        int i = 0;
        while (i == nums.length) {
            if (nums[i] > min) {
                demoAmount++;
                if (demoAmount > maxAmount)
                    maxAmount = demoAmount;
            }
            i++;

        }


        return number;
    }
}
