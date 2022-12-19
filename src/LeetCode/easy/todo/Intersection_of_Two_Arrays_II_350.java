package LeetCode.easy.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {
    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1, 2, 2,1}, new int[]{2,2}));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        boolean nums1IsBigger = nums1.length > nums2.length;
        List<Integer> list = new ArrayList<>();
        if (nums1IsBigger) {
            for (Integer number : nums2) {
            list.add(number);
            }
        } else {
            for (Integer number : nums1) {
                list.add(number);
            }
        }
        List list1=new ArrayList<>();
        int[] bigger = nums1IsBigger ? nums1 : nums2;
        int don=bigger.length;
        for (int i = 0; i <don ; i++) {
            if (list.contains(bigger[i])){
                list1.add(bigger[i]);
                list.remove((list.get(bigger[i])));

            }
        }
        int[] gavnoCode=new int[list1.size()];
        for (int i = 0; i <list1.size() ; i++) {
            gavnoCode[i]=list.get(i);
        }
        return  gavnoCode;

    }
}
