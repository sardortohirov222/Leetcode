package LeetCode.easy.solving;

import java.util.HashSet;
import java.util.Set;

/**
 * Date-1/27/2023
 * Time-11:48 AM
 */
public class Repeated_Substring_Pattern_459 {
    public static void main(String[] args) {
        var a = new Repeated_Substring_Pattern_459();
        System.out.println(a.repeatedSubstringPattern("abaababaab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        String repWord = repeatingWord(s);
        if (repWord.length() == 0) {
            return false;
        }
        s = s.replaceAll(repWord, "");
        return s.length() == 0;
    }

    public String repeatingWord(String word) {
        String w = String.valueOf(word.charAt(0));
        int i = 1;
        while (word.length() / 2+1 > i) {
            if (word.substring(i, w.length() + i).equals(w)) {
                return w;
            }
            w += word.charAt(i++);
        }
        return "";
    }
}