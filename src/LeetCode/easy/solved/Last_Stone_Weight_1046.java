package LeetCode.easy.solved;

import java.util.*;

/**
 * Date-1/10/2023
 * Time-9:46 AM
 */
public class Last_Stone_Weight_1046 {
    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : stones) {
            list.add(a);
        }
        Collections.sort(list);
        while (list.size() > 1) {
            int a = list.size();
            if (list.get(a - 1) > list.get(a - 2)) {
                list.add(( list.get(a - 1) -list.get(a - 2)));
                list.remove(a-2);
                list.remove(a-2);
                Collections.sort(list);
            } else {
                list.remove(a - 1);
                list.remove(a -2);
            }
        }
        if (list.size()==1){
            return list.get(0);
        }
        else {
            return 0;
        }
    }
}
