package LeetCode.easy.todo;

import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("sadrbek"));
    }

    public static boolean checkIfPangram(String sentence) {
        int a=0;
        int i=0;
        while (sentence.length()>i){
            sentence.replaceAll(String.valueOf(sentence.charAt(i)),"");
            i++;
            a++;
        }
        return a>25;
    }





}
