package LeetCode.medium.solved;

import java.util.LinkedList;

/**
 * Date-7/25/2023
 * Time-12:24 AM
 */
public class Increasing_Triplet_Subsequence_334 {
    public boolean increasingTriplet(int[] nums) {
        int len=nums.length-1;
        if (len < 2) return false;
        int a = 2147483647, b =2147483647, i = 0;
        while (i < len) {
            if (nums[i] > b)
                return true;
            else if (nums[i] < nums[i + 1] && nums[i] < a && nums[i + 1] < b) {
                a = nums[i];
                b = nums[i + 1];
            } else if (a < nums[i] && b > nums[i])
                b = nums[i];

            i++;

        }
        return nums[i] > b;
    }

}
