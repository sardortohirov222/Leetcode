package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date-1/20/2023
 * Time-8:15 AM
 */
public class Non_decreasing_Subsequences_491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int lenNum=0;
        int il=0;
        while (lenNum<nums.length){
            List<Integer> integerList=new ArrayList<>();
            integerList.add(nums[0]);
        }
        return list;
    }
}
