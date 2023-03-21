package LeetCode.medium.solved;

/**
 * Date-3/21/2023
 * Time-6:42 AM
 */
public class Number_of_Zero_FilledSubarrays_2348 {
    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        int k = 0;
        long sum = 0;
        while (i < nums.length) {
            if (nums[i] == 0)  {
                sum += k + 1;
                k++;
            }else {
                k=0;
            }
            i++;
        }
        return sum;
    }
}
