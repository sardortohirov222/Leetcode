package LeetCode.easy.todo;

import java.util.HashMap;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        Find_Pivot_Index index = new Find_Pivot_Index();
        System.out.println(index.sortSentence("is2 sentence4 This1 a3"));
    }

    public String sortSentence(String s) {

        HashMap<Integer, String> map = new HashMap<>();
        for (String or : s.split(" ")
        ) {
            map.put(Integer.valueOf(or.substring(or.length() - 1)), or.substring(0, or.length() - 1) + " ");
        }
        String s1 = "";
        for (int i = 1; i < map.size() + 1; i++) {
            s1 += map.get(i);

        }
        return s1.substring(0,s1.length()-1);

    }

}
