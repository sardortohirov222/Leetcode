package LeetCode.easy.solved;

import java.util.ArrayList;
import java.util.Set;

/**
 * Date-7/23/2023
 * Time-11:31 PM
 */
public class Reverse_Vowels_of_a_String_345 {
    public static void main(String[] args) {
        System.out.println(new Reverse_Vowels_of_a_String_345().reverseVowels("grantelilo"));
    }
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        Set<Character> chars =Set.of('a','A','I','i','e','E','U','u','O','o');
        for (int i = 0; i < c.length; i++) {
            if (chars.contains(c[i])) arr.add(c[i]);
        }
        String s1 = "";
        int len = arr.size() - 1;
        for (int i = 0; i < c.length; i++) {
            if (chars.contains(c[i])) {
                s1 += arr.get(len);
                len--;
            } else {
                s1 += c[i];
            }
        }

        return s1;
    }
}
