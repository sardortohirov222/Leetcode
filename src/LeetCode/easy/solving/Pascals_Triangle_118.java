package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-9/7/2023
 * Time-10:20 PM
 */
public class Pascals_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        lists.add( firstRow);
        int i=1;
        while (i<numRows){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for (int j = 0; j <lists.get(i-1).size()-1; j++) {
               row.add(lists.get(i-1).get(j)+lists.get(i-1).get(j+1));
            }
            row.add(1);
            lists.add( row);
            i++;
        }
        return lists;
    }
}
