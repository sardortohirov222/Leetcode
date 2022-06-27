package LeetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number phone_number=new Letter_Combinations_of_a_Phone_Number();
        phone_number.letterCombinations("234");
    }

    public List<String> letterCombinations(String digits) {
        HashMap list = new HashMap<>();
        list.put(2, "abc");
        list.put(3, "def");
        list.put(4, "ghi");
        list.put(5, "jkl");
        list.put(6, "mno");
        list.put(7, "pqrs");
        list.put(8, "tuv");
        list.put(9, "wxyz");

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            int numbers = Integer.parseInt(digits.substring(i,i+1));
            for (int j = 0; j <list.get(numbers).toString().length() ; j++) {
                System.out.println(list.get(numbers).toString().substring(j,j+1));
            }
        }


        return list1;
    }


}
