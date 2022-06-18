package LeetCode.easy;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        Running_Sum_of_1d_Array sum_of_1d_array = new Running_Sum_of_1d_Array();
        for (int a : sum_of_1d_array.runningSum(new int[]{1, -2, 3, 4, 5})) {
            System.out.println(a);
        }
    }

    public int[] runningSum(int[] nums) {
        int ol = nums.length;
        int[] sums = new int[ol];
        int sum = 0;
        for (int i = 0; i < ol; i++) {
            sum+=nums[i];
            sums[i]=sum;
        }
        return sums;
    }
}
//    public int[] runningSum(int[] nums) {
//        int[] sum=new int[nums.length];
//        int s=0;
//        for(int i=0;i<nums.length;i++){
//            s+=nums[i];
//            sum[i]=s;
//        }
//        return sum;
//    }