package LeetCode.medium.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date-1/7/2024
 * By Sardor Tokhirov
 * Time-8:37 AM (GMT+5)
 */
public class Convert_an_Array_Into_a_2D_Array_With_Conditions_2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int num : nums) {
            integerList.add(num);
        }
        list.add(integerList);
        while (Integer.MIN_VALUE < nums[0]) {
            List<Integer> tempList = new ArrayList<>();
            int i = 1;
            while (i < integerList.size()) {
                if (integerList.get(i - 1).equals(integerList.get(i))) {
                    tempList.add(integerList.get(i));
                    integerList.remove(i);
                    i--;
                }
                i++;
            }
            if (tempList.size()==0)break;
            list.add(tempList);
            integerList = tempList;
        }
        return list;
    }
}
