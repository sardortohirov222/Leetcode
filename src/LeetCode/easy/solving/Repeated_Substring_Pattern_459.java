package LeetCode.easy.solving;

import java.util.HashSet;
import java.util.Set;

/**
 * Date-1/27/2023
 * Time-11:48 AM
 */
public class Repeated_Substring_Pattern_459 {
    public static void main(String[] args) {
        var a = new Repeated_Substring_Pattern_459();
        System.out.println(a.repeatedSubstringPattern("ababab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int sLens=s.length();
        int len=sLens/2;
        while (len>=1){
            if(sLens%len==0){
                if (s.replaceAll(s.substring(0,len),"").length()==0){
                    return true;
                }
            }
            len--;
        }

        return false;
    }

}