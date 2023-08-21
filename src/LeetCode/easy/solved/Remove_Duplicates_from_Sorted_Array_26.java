package LeetCode.easy.solved;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Date-8/19/2023
 * Time-12:49 AM
 */
public class Remove_Duplicates_from_Sorted_Array_26 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int s : nums) {
            set.add(s);
        }
        int i=0;
        for (int s : set) {
            nums[i]=s;
            i++;
        }

        return set.size();
    }
}
