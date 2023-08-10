package LeetCode.medium.solved;

/**
 * Date-8/10/2023
 * Time-12:08 AM
 */
public class Search_in_Rotated_Sorted_Array_II_81 {
    public boolean search(int[] nums, int target) {
        for (int i : nums) if (i == target) return true;
        return false;
    }
}
