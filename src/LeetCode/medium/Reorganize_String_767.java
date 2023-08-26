package LeetCode.medium;


import java.util.Arrays;

/**
 * Date-8/22/2023
 * Time-11:19 PM
 */
public class Reorganize_String_767 {
    public static void main(String[] args) {
        //I tried but ...,
        System.out.println(new Reorganize_String_767().reorganizeString("baaba"));
    }
    public String reorganizeString(String s) {
        char[] charArray = s.toCharArray();int c=0;
        for (int i = 1; i <s.length() ; i++) {
            if (charArray[i]==charArray[i-1]){
                int j=0;
                char val=charArray[i-1];
                while (j<charArray.length){
                    if ((j-1>0&&charArray[j-1]!=val)||(j+1<s.length()&&charArray[j+1]!=val)&&charArray[j]!=val){
                        charArray[i-1]=charArray[j];
                        charArray[j]=val;
                        break;
                    }
                    j++;
                }
                if (j==s.length()) return "";
            }
        }
        return new String(charArray);
    }
}
