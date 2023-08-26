package LeetCode.easy.solved;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Date-8/19/2023
 * Time-12:49 AM
 */
public class Remove_Duplicates_from_Sorted_Array_26 {
    public static void main(String[] args) {
        System.out.println(new Remove_Duplicates_from_Sorted_Array_26().removeDuplicates(new int[]{1,1,2}));
    }
//    public int removeDuplicates(int[] nums) {
//        HashSet<Integer> set = new LinkedHashSet<>();
//        for (int s : nums) {
//            set.add(s);
//        }
//        int i=0;
//        for (int s : set) {
//            nums[i]=s;
//            i++;
//        }
//
//        return set.size();
//    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
