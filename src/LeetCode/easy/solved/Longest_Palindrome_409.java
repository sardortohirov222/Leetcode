package LeetCode.easy.solved;

/**
 * Date-12/31/2022
 * Time-10:23 AM
 */
public class Longest_Palindrome_409 {
    public int longestPalindrome(String s) {
        int count = 0;
        int a = 0;
        int beta = s.length();
        while (s.length() != 0) {
            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            int ab = beta - s.length();
            beta = s.length();
            count = count+ab - (ab % 2);
            if (ab % 2 == 1) {
                a++;
            }
        }
        if (a > 0) {
            count++;
        }
        return count;
    }
}
