package LeetCode.easy;

public class Build_Arrayfrom_Permutation {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,2,3,4,5}));
    }
    public  static int[] buildArray(int[] nums) {
        int i=1;
        int num=0;
        while (i< nums.length-1){
            num=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=num;
            i++;
        }
        return nums;
    }

}
