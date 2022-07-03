package LeetCode.easy.todo;

import java.util.*;

public class Maximum_Unit_son_a_Truck {
    public static void main(String[] args) {
//        int array[][] = {{1, 11}, {2, 34}, {3, 8}, {8, 4}, {7, 23}};
        HashMap map = new HashMap();
        map.put(1, 24);
        map.put(4, 21);
        map.put(6, 11);
        map.put(2, 8);
        map.put(11, 7);

//        System.out.println(map.get(1));
        System.out.println(maximumUnits(new int[][]{{1, 11}, {2, 34}, {3, 8}, {8, 4}, {7, 23}}, 6));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List list = new ArrayList<>();
        for (int[] pop : boxTypes) {
            if (map.containsKey(pop[1])) {
                map.put(pop[1], map.get(pop[1]) + pop[0]);
            } else {
                map.put(pop[1], pop[0]);
                list.add(pop[1]);
            }
        }
        Collections.sort(list);
        int count = 0;
        int list_size = list.size() - 1;
        while (list_size >= 0) {
            if (map.get(list.get(list_size)) >= truckSize) {
                count += (int) list.get(list_size) * truckSize;
                break;
            } else {
                count += (int) list.get(list_size) * map.get(list.get(list_size));
                truckSize = truckSize - map.get(list.get(list_size));
                list_size--;
            }

        }

        return count;


    }
}
