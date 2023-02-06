package LeetCode.easy.solved;

/**
 * Date-2/6/2023
 * Time-9:27 AM
 */
public class Shuffle_the_Array_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] newInt=new int[nums.length];
        int a=0;
        for (int i = 0; i < n ; i++) {
            newInt[a]=nums[i];
            newInt[a+1]=nums[i+n];
            a+=2;
        }
        return newInt;
    }
}
