package LeetCode.easy.cheat_sheet.todo;

public class Soulution {

    public static void main(String[] args) {
        System.out.println(
                smallerNumbersThanCurrent(new int[]{1,2,3,4,5,6,7,8,9})
        );
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sam=new int[nums.length];
        int i=0;
        int n=0;
        int count=0;
        while (n< nums.length){
            if(nums[i]<nums[n]){
               count++;
            }
            i++;
            if(i>nums.length-1){
                i=0;
                sam[n]=count;
                n++;
                count=0;
            }
        }
        return sam;

    }


}
