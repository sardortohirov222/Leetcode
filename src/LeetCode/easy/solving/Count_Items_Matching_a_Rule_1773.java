package LeetCode.easy.solving;

import java.util.List;

/**
 * Date-11/2/2023
 * By Sardor Tokhirov
 * Time-11:58 PM (GMT+5)
 */
public class Count_Items_Matching_a_Rule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        char ix = ruleKey.charAt(0);
        if (ix == 'c') {
            index = 1;
        } else if (ix == 'n') {
            index = 2;
        }
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue))
                count++;
        }
        return count;
    }


}
