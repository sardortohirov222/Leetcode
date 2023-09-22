package LeetCode.easy.solved;

/**
 * Date-12/29/2022
 * Time-9:09 AM
 */
public class Is_Subsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (s.length() > i && t.length() > j) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
