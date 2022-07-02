package LeetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        System.out.println(generate(0));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1));
        while (lists.size() < numRows) {
            List<Integer> integerList_2 = new ArrayList<>();
            integerList_2.add(1);
            if (lists.size() >=2 ) {
                for (int j = 0; j < lists.get(lists.size()-1).size()-1; j++) {
                    integerList_2.add(lists.get(lists.size()-1).get(j) + lists.get(lists.size()-1).get(j+1));
                }
            }
            integerList_2.add(1);
            lists.add(integerList_2);
        }
        return lists;
    }

}
