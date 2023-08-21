package LeetCode.easy.solved;

/**
 * Date-8/19/2023
 * Time-10:28 PM
 */
public class Remove_Element_27 {
    public static void main(String[] args) {
        System.out.println(new Remove_Element_27().removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
