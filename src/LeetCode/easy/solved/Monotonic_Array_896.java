package LeetCode.easy.solved;

/**
 * Date-1/24/2023
 * Time-8:57 AM
 */
public class Monotonic_Array_896 {
    public static void main(String[] args) {
        var a=new Monotonic_Array_896();
        System.out.println(a.isMonotonic(new int[]{1,4,2,2,3}));
    }
    public boolean isMonotonic(int[] nums) {
        if (nums.length > 2) {
            if (nums[0] > nums[nums.length - 1]) {
                return decreasing(nums);
            } else {
                return increasing(nums);
            }
        } else {
            return true;
        }

    }

    boolean increasing(int[] nums) {
        int i = 1;
        while (nums.length > i) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    boolean decreasing(int[] nums) {
        int i = 1;
        while (nums.length > i) {
            if (nums[i] > nums[i -1]) {
                return false;
            }
            i++;
        }
        return true;
    }


}
