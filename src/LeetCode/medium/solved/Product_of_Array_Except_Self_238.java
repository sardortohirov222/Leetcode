package LeetCode.medium.solved;

import java.util.ArrayList;

/**
 * Date-8/8/2023
 * Time-12:33 AM
 */
public class Product_of_Array_Except_Self_238 {

    public int[] productExceptSelf(int[] nums) {
        int num = 1;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0) return zeroIndexed(nums, i+1, num);
            num *= nums[i];
        }

        int[] product = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product[i] = num / nums[i];
        }
        return product;
    }

    int[] zeroIndexed(int[] nums, int zeroIndex, int num) {
        for (int i = zeroIndex; i <nums.length ; i++) {
            if (nums[i]==0) return new int[nums.length];
            num*=nums[i];
        }
        int[] answer=new int[nums.length];
        answer[zeroIndex-1]=num;
        return answer;
    }
}
