package LeetCode.easy.solved;

/**
 * Date-1/12/2024
 * By Sardor Tokhirov
 * Time-4:09 AM (GMT+5)
 */
public class Determine_if_String_Halves_Are_Alike_1704 {
    public boolean halvesAreAlike(String s) {
        return numberOfVowels(s.substring(0, s.length() / 2)) == numberOfVowels(s.substring(s.length() / 2));
    }

    public int numberOfVowels(String str) {
        int num = 0;
        for (char c : str.toCharArray()) {
            if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117)
                num++;
        }
        return num;
    }
}
