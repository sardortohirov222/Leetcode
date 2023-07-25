package LeetCode.medium.solved;

/**
 * Date-7/24/2023
 * Time-11:58 PM
 */
public class Reverse_Words_in_a_String_151 {
    public String reverseWords(String s) {
        String[] strList=s.split(" ");
        StringBuilder newStr=new StringBuilder();
        for (int i = strList.length-1; i >=0 ; i--) {
            if (strList[i].length()>0) newStr.append(strList[i]).append(" ");
        }
        return newStr.toString().trim();
    }

}
