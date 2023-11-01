package LeetCode.medium.solving;

/**
 * Date-9/30/2023
 * By Sardor Tokhirov
 * Time-10:13 AM (GMT+5)
 */
public class Pattern_456 {
    public static void main(String[] args) {
        System.out.println(new Pattern_456().find132pattern(new int[]{1,2,8,4}));
    }
    public boolean find132pattern(int[] nums) {
        int i=0;
        while (i< nums.length-2){
            if (nums[i]<nums[i+1]&&nums[i+1]>nums[i+2])
                return true;
                i++;
        }
        return false;
    }
}
