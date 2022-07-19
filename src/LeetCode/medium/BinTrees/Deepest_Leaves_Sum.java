package LeetCode.medium.BinTrees;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Deepest_Leaves_Sum {
    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent(new int[]{1,2,3,4,5,7,8,9}));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).sum());

        return null;

    }
}
