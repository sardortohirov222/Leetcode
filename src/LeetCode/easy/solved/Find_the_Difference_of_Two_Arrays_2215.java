package LeetCode.easy.solved;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Date-8/4/2023
 * Time-11:39 PM
 */
public class Find_the_Difference_of_Two_Arrays_2215 {

    HashSet<Integer> checkerNewElems = new HashSet<>();

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = listConvert(new HashSet(Arrays.stream(nums1).boxed().collect(Collectors.toSet())), nums2);
        List<Integer> list2 = listConvert(new HashSet(Arrays.stream(nums2).boxed().collect(Collectors.toSet())), nums1);
        return new ArrayList<>(List.of(list2, list1));
    }

    public ArrayList<Integer> listConvert(HashSet numsInHashSet, int[] nums1) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (checkerNewElems.contains(nums1[i])) continue;
            if (numsInHashSet.contains(nums1[i])) continue;
            list.add(nums1[i]);
            checkerNewElems.add(nums1[i]);
        }
        return list;
    }


}
