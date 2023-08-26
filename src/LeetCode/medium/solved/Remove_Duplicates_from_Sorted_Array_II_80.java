package LeetCode.medium.solved;

/**
 * Date-8/26/2023
 * Time-12:21 AM
 */
public class Remove_Duplicates_from_Sorted_Array_II_80 {

    public int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count >= 2) {
                    continue;
                }
            } else {
                count = 0;
            }
            nums[j] = nums[i];
            j++;

        }
        return j;
    }
}


