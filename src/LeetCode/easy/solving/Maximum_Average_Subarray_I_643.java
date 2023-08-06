package LeetCode.easy.solving;

/**
 * Date-8/5/2023
 * Time-11:28 PM
 */

public class Maximum_Average_Subarray_I_643 {

    public double findMaxAverage(int[] nums, int k) {
        double bigOne = Integer.MIN_VALUE;
        int i = 0;
        double num =0;
        for (int j = 0; j < k; j++) {
            num += nums[j];
        }
        while (i <nums.length - k) {
            if (bigOne < (num /k)) bigOne = num / k;
            i++;
            num=num-nums[i-1]+nums[i+k-1];
        }
        if (bigOne < (num /k)) bigOne = num / k;
        return bigOne;
    }
}
