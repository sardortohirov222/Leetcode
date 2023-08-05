package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Date-8/1/2023
 * Time-12:16 AM
 */
public class Combinations_77 {
    public static void main(String[] args) {
        System.out.println(new Combinations_77().combine(4, 3));
    }

    List<List<Integer>> list = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        for (int i = 1; i <= n; i++) {
            childCombine(i, n, k);
        }
        return null;
    }

    public void childCombine(int from, int to, int k) {
        List<Integer> list = new LinkedList();
        int i = 0;
        while (i<k){
            for (int j = from; j < to; j++) {
                list.add(j);
            }

        }
    }
}
