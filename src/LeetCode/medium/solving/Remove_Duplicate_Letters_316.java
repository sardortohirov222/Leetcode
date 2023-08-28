package LeetCode.medium.solving;

import java.util.HashSet;

/**
 * Date-8/18/2023
 * Time-11:04 PM
 */
public class Remove_Duplicate_Letters_316 {
//Bro i thought it is easy to solve i was wrong sorry  i believe what i will sole it soon
    public String removeDuplicateLetters(String s) {
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : set) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

