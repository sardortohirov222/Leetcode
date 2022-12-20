package LeetCode.easy.cheat_sheet;

import java.util.HashSet;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet set=new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
         if(set.contains(nums[i])){
             return true;
         }
            set.add(nums[i]);
        }
        return false;
    }
}
