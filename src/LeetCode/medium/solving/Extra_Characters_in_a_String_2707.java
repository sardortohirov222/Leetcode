package LeetCode.medium.solving;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Date-9/2/2023
 * Time-12:11 AM
 */
// I am pussy, i couldn't solve it
public class Extra_Characters_in_a_String_2707 {
    public static void main(String[] args) {
        System.out.println(new Extra_Characters_in_a_String_2707().minExtraChar("dwmodizxvvbosxxw",new String[]{"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"}));
    }
    public int minExtraChar(String s, String[] dictionary) {
        Comparator<String> customComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());
        Arrays.sort(dictionary, customComparator);
        int n=0;
        int i=0;
        while (i<dictionary.length){
            int j=s.indexOf(dictionary[i]);
            if (j!=-1){
                s=s.substring(0,j)+"."+s.substring(dictionary[i].length()+j);
                n++;
            }
            i++;
        }
        return s.length()-n;
    }
}
