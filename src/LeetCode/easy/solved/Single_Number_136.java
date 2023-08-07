package LeetCode.easy.solved;

import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * Date-8/7/2023
 * Time-1:08 AM
 */
public class Single_Number_136 {

    public int singleNumber(int[] nums) {
        HashSet set=new HashSet();
        for (int i = 0; i <nums.length ; i++) {
            int lenSet=set.size();
            set.add(nums[i]);
            if (lenSet==set.size()){
                set.remove(nums[i]);
            }
        }
        return (int)set.toArray()[0];
    }
}
