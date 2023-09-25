package LeetCode.easy.solving;

import java.util.Arrays;

/**
 * Date-9/25/2023
 * By Sardor Tokhirov
 * Time-2:21 AM (GMT+5)
 */

// I solved i,  but it can be faster on log n  solution
public class Find_the_Difference_389 {

    public char findTheDifference(String s, String t) {
        char[] charT=t.toCharArray();
        char[] charS=s.toCharArray();
        Arrays.sort(charT);
        Arrays.sort(charS);
        for (int i = 0; i <s.length() ; i++) {
            if (charS[i]!=charT[i]){
                return charT[i];
            }
        }
        return charT[s.length()];
    }
}
