package LeetCode.easy.solved;

/**
 * Date-2/20/2023
 * Time-8:19 AM
 */
public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int index=nums.length;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                index=i;
                break;
            }
            if (nums[i]>target){
                index=i;
                break;
            }

        }
        return index;
    }
}
