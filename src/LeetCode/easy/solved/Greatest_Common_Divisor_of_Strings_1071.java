package LeetCode.easy.solved;

/**
 * Date-2/1/2023
 * Time-6:51 AM
 */
public class Greatest_Common_Divisor_of_Strings_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return even(str1,str2);
        } else {
            return even(str2,str1);
        }
    }
    public String even(String big, String small) {
        int len = small.length();
        int i = 1;
        while (i <= len) {
            String rep = small.substring(0, len/i);
            if (small.replaceAll(rep, "").equals("") && big.replaceAll(rep, "").equals("")) {
                return rep;
            }
            i++;
        }
        return "";
    }
}
