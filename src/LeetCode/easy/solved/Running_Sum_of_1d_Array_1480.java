package LeetCode.easy.solved;

/**
 * Date-12/27/2022
 * Time-9:11 AM
 */
public class Running_Sum_of_1d_Array_1480 {
    public int[] runningSum(int[] nums) { //[1,2,3,4]
        int a=1;
        while (nums.length>a){
            // [1]+[1]...[6]+[4]
            nums[a]=nums[a]+nums[a-1];
            a++;
        }
        return nums;
    }
}
