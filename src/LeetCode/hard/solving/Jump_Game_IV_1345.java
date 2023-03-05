package LeetCode.hard.solving;

import java.util.*;

/**
 * Date-3/4/2023
 * Time-5:07 PM
 */
public class Jump_Game_IV_1345 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 12, 14, 5, 3, 8, 9, 1, 12, 40};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(-23);
        arrayList.add(-23);
        arrayList.add(404);
        arrayList.add(100);
        arrayList.add(23);
        arrayList.add(23);
        arrayList.add(23);
        arrayList.add(3);
        arrayList.add(404);

        int i = 0;

        while (i < arrayList.size()) {
            int as = arrayList.get(i);
            arrayList.remove(i);
            if (arrayList.indexOf(as) == -1) {
                i++;
            }
            i = as;
        }


    }

    class Solution {
        public int minJumps(int[] arr) {
            int n = arr.length;

            if(n == 1) return 0;
            Map<Integer, List<Integer>> map = new HashMap<>();
            int step = 0;

            // fill the map
            for(int i = 0; i < n; i++){
                map.computeIfAbsent(arr[i], v -> new ArrayList()).add(i);
            }
            Queue<Integer> q = new LinkedList<>();
            q.offer(0);

            while(!q.isEmpty()){
                step++;
                int size = q.size();
                for(int i = 0; i < size; i++){
                    int j = q.poll();

                    if(j - 1 >= 0 && map.containsKey(arr[j - 1])){
                        q.offer(j - 1);
                    }

                    if(j + 1 < n && map.containsKey(arr[j + 1])){
                        if(j + 1 == n - 1) return step;
                        q.offer(j + 1);
                    }

                    if(map.containsKey(arr[j])){
                        for(int k : map.get(arr[j])){
                            if(k != j){
                                if(k == n - 1) return step;
                                q.offer(k);
                            }
                        }
                    }
                    map.remove(arr[j]);
                }
            }

            return step;
        }
    }
}
