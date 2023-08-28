package LeetCode.medium.solved;

/**
 * Date-8/26/2023
 * Time-11:22 PM
 */
public class Rotate_Array_189 {

    public void rotate(int[] nums, int k) {
        int[] rotNums=nums.clone();
        int j=0,val=nums.length-k%nums.length;
        for (int i = val; i <nums.length ; i++) {
            nums[j]=rotNums[i];
            j++;
        }
        for (int i = 0; i <val ; i++) {
            nums[j]=rotNums[i];
            j++;
        }

    }
}
