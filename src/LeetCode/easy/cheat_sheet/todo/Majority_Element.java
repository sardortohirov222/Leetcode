package LeetCode.easy.cheat_sheet.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Majority_Element {
    public static void main(String[] args) {
        Majority_Element majority_element = new Majority_Element();
        System.out.println(majority_element.majorityElement(new int[]{1,21,21,1,3,4,6,71,100,1012,123,23,1,23,12,1,99,9,9,99,9,9,9,9,9,9,9,21,54,6546,456,45,64,6,4,564,56,4,56,46,46,46,46,4,6,4,6,4,6,4,6,4}));
    }

    public int majorityElement(int[] nums) {
      List list=new ArrayList<>();
        for (int a:nums) {
            list.add(a);
        }
        int big=0;
        int nom = 0;
        int mon=0;
        while (!list.isEmpty()){
            mon= (int) list.get(0);
            int a = list.size();
            list.removeAll(Collections.singleton(mon));
            int b = a - list.size();
            if (big < b) {
                big = b;
                nom = mon;
            }
        }

        return nom;
    }


}


//    public int majorityElement(int[] nums) {
//        List list = new ArrayList<>();
//        for (Integer i : nums
//        ) {
//            list.add(i);
//        }
//        List list1=list;
//        int biggest = 0;
//        int biggest2 = 0;
//        for (int i = 0; i <= 9; i++) {
//            int items = list1.size();
//            list1.removeAll(Collections.singleton(i));
//            items = items - list1.size();
//            if (items > biggest) {
//                biggest=items;
//                biggest2 = i;
//            }
//            list1=list;
//        }
//
//        return biggest2;
//    }