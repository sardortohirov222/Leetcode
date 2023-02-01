package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Date-1/31/2023
 * Time-10:26 AM
 */
public class Best_Team_With_No_Conflicts_1626 {
    public static void main(String[] args) {
        System.out.println(bestTeamScore(new int[]{3,2,8,4,9,3},new int[]{7,3,4,7,1,8}));
    }

    public static int bestTeamScore(int[] scores, int[] ages) {
//        Map.Entry<Integer,Integer> list= (Map.Entry<Integer, Integer>) new HashMap<Object, Object>();
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,1000);
        map.put(3,380);
        map.put(4,700);

        return 0;
    }
}
