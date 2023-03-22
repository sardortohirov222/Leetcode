package LeetCode.medium.solving;

import java.util.HashSet;
import java.util.Set;

/**
 * Date-3/21/2023
 * Time-10:50 PM
 */
public class Minimum_Score_of_a_Path_Between_Two_Cities_2492 {
    public static void main(String[] args) {
        int[][] arr={{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        System.out.println(new Minimum_Score_of_a_Path_Between_Two_Cities_2492().minScore(16,arr));
    }

    Set<Integer> integerSet=new HashSet<>();
    int smallNum=100000;
    public int minScore(int n, int[][] roads) {
        integerSet.add(n);
        setRoad(1,roads);
        return smallNum;
    }
    public void setRoad(int num, int[][] roads){
        for (int i = 0; i <roads.length ; i++) {
            if (integerSet.contains(roads[i][0])){
                if (integerSet.contains(roads[i][1])){
                    continue;
                }
                if (smallNum>roads[i][2]){
                    smallNum=roads[i][2];
                }
                integerSet.add(roads[i][1]);
                setRoad(roads[i][1],roads);
            }
        }
    }


}
