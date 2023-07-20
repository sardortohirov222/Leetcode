package LeetCode.easy.solving;

/**
 * Date-7/3/2023
 * Time-9:24 AM
 */
public class Buddy_Strings_859 {
    public static void main(String[] args) {
        System.out.println(new Buddy_Strings_859().buddyStrings("ab","ba"));
    }
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
