package LeetCode.easy.todo;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        System.out.println(getConcatenation(new int[]{1,2,3,5,7}));

    }
    public static int[] getConcatenation(int[] nums) {
        int[] nums_2 = new int[nums.length * 2];
        int i = 0;
        while (i < nums.length) {
            nums_2[i]=nums_2[i+nums.length]=nums[i];
            i++;
        }
        return nums_2;
    }
}
