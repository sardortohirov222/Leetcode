package LeetCode.medium.solved;

/**
 * Date-2/21/2023
 * Time-8:47 AM
 */
public class Single_Element_in_a_Sorted_Array_540 {
    public  int singleNonDuplicate(int[] nums) {
        int num=nums[nums.length-1];
        int i=0;
        while (i<nums.length-1){
            if (nums[i]!=nums[i+1]){
                num=nums[i];
                break;
            }
            i+=2;
        }
        return num;
    }
}
