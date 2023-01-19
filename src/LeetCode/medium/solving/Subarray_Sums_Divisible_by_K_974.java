package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date-1/19/2023
 * Time-9:20 AM
 */
public class Subarray_Sums_Divisible_by_K_974 {
    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        List l = new ArrayList<>();
        for (int a : nums) {
            l.add(a);
        }
        return putNum(l, k, 0);
    }

    public static int putNum(List<Integer> list, int k, int numSub) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            counter += list.get(i);
            if (counter % k == 0) {
                numSub++;
            }
        }
        if (list.size() != 0) {
            list.remove(list.size() - 1);
            return putNum(list, k, numSub);
        } else {
            return numSub;
        }
    }
}

