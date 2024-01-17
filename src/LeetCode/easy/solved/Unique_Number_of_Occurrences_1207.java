package LeetCode.easy.solved;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Date-1/16/2024
 * By Sardor Tokhirov
 * Time-10:19 PM (GMT+5)
 */
public class Unique_Number_of_Occurrences_1207 {
    public static void main(String[] args) {
        System.out.println(new Unique_Number_of_Occurrences_1207().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet();
        Arrays.sort(arr);
        int j = 1, num = 0, i = 1;
        while (i < arr.length) {
            if (arr[i - 1] != arr[i]) {
                set.add(j);
                num++;
                if (set.size() != num) return false;
                j = 0;
            }
            j++;
            i++;
        }
        return !set.contains(j);
    }
}
