package LeetCode.easy.solved;

import java.util.Arrays;

/**
 * Date-8/26/2023
 * Time-2:37 AM
 */
public class Majority_Element_169 {
    public static void main(String[] args) {
        System.out.println(new Majority_Element_169().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
