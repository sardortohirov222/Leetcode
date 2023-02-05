package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Date-2/4/2023
 * Time-8:35 AM
 */
public class Permutation_in_String_567 {
    public static void main(String[] args) {
        var a = new Permutation_in_String_567();
        System.out.println(a.checkInclusion("ab",
                "eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            arr[s2.charAt(i) - 'a']--;
            if (i - n >= 0) {
                arr[s2.charAt(i - n) - 'a']++;
            }
            if (zero(arr)) {
                return true;
            }
        }
        return false;
    }

    public boolean zero(int[] arr) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;

    }

//    public boolean checkInclusion(String s1, String s2) {
//        LinkedList<Character> list = new LinkedList<>();
//        for (char c : s1.toCharArray()) {
//            list.add(c);
//        }
//        LinkedList<Character> demo = new LinkedList<>(list);
//        int i = 0;
//        int p = 0;
//        while (p < s2.length()) {
//            if (demo.contains(s2.charAt(p))) {
//                demo.remove((Character) s2.charAt(p));
//                if (demo.size() == 0) {
//                    return true;
//                }
//                p++;
//            } else if (demo.size() < list.size()) {
//                demo = new LinkedList<>(list);
//                i++;
//                p = i;
//                if (demo.size() > s2.length() - i) {
//                    return false;
//                }
//            } else {
//                p++;
//                i++;
//            }
//        }
//        return false;
//    }


}
