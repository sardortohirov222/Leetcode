package LeetCode.easy.todo;

import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("sadrbek"));
    }

    public static boolean checkIfPangram(String sentence) {
       if (sentence.length()<26){
           return false;
       }
        Set<Character> set=new HashSet();
        for (int i = 0; i <sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        if(set.size()>25){
            return true;
        }
        else {
            return false;
        }

    }





}
