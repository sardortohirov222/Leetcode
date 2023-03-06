package LeetCode.easy.solved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Date-3/6/2023
 * Time-9:01 AM
 */
public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        while (i<nums.length){
            if (nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
