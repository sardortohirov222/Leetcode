package LeetCode.easy.solving;

import java.util.Arrays;

/**
 * Date-1/7/2024
 * By Sardor Tokhirov
 * Time-5:56 AM (GMT+5)
 */
public class Assign_Cookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
