package LeetCode.medium.solving;

import java.util.Collections;
import java.util.HashMap;

/**
 * Date-2/7/2023
 * Time-9:01 AM
 */
public class Fruit_Into_Baskets_904 {
    public static void main(String[] args) {
        var fruit = new Fruit_Into_Baskets_904();
        System.out.println(fruit.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap();
        int bigOne = 0;
        int bigTwo = 0;
        for (int i = 0; i < fruits.length; i++) {
            int fruitKeys = fruits[i];
            if (map.containsKey(fruitKeys)) {
                map.put(fruitKeys, map.get(fruitKeys) + 1);
            } else {
                map.put(fruitKeys, 1);
            }
            if (map.get(fruitKeys) > bigOne) {
                bigOne = map.get(fruitKeys);
            } else if (map.get(fruitKeys) > bigTwo) {
                bigTwo = map.get(fruitKeys);
            }
        }
        return bigOne+bigTwo;
    }
}
