package LeetCode.medium.solved;

/**
 * Date-8/7/2023
 * Time-11:56 PM
 */
public class Search_in_Rotated_Sorted_Array_33 {
    public int search(int[] nums, int target) {
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
