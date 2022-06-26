package LeetCode.easy;

public class Move_Zeroes {
    public static void main(String[] args) {
     Move_Zeroes move_zeroes=new Move_Zeroes();
     move_zeroes.moveZeroes(new int[]{1,0,2,3,0,76,0,6,2,5,0,0,4,3});

    }

    public void moveZeroes(int[] nums) {
        int without_zero=0;
        int with=0;
        while (with < nums.length) {
            if(nums[with]!=0) {
                nums[without_zero]=nums[with];
                with++;
                without_zero++;
            }else {
                with++;
            }

        }
        while (without_zero<nums.length){
            nums[without_zero]=0;
            without_zero++;
        }

    }

}
