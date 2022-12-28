package LeetCode.easy.solved;

import java.util.stream.IntStream;

/**
 * Date-12/27/2022
 * Time-9:31 AM
 */
public class Find_Pivot_Index_724 {
    public int pivotIndex(int[] nums) {
        int right_sum= 0;
        for (int num:nums) {
            right_sum+=num;
        }
        right_sum=right_sum-nums[0];
        int left_sum=0;
        int i=0;
        while (i<nums.length-1){
            if(right_sum==left_sum)
                return i;
            right_sum=right_sum-nums[i+1];
            left_sum=left_sum+nums[i];
            i++;
        }
        if(right_sum==left_sum)
            return i;
        else
            return -1;
    }
}
