package LeetCode.medium;

import java.util.List;

public class Longest_Palidromic {
    public static void main(String[] args) {


        System.out.println(longestPalindrome("sartuutsa"));
    }

//    public static String longestPalindrome(String s) {
//       String biggest="";
//        int i=0;
//        while (s.length()>0){
//            String begin="";
//            String end="";
//            for (int j = 0; j < ; j++) {
//
//            }
//
//        }
//
//        return biggest;
//
//    }
//}
 public static String longestPalindrome(String s) {
        String number= "";
        int len=s.length();
            for (int k = 0; k <len ; k++) {
                for (int lon = k; lon <=len; lon++) {
                        String pali = s.substring(k, lon);
                        int nel=pali.length();
                        String sar = "";
                        String dor = "";
                        for (int j = 0; j < (nel + 1) / 2; j++){
                            sar += pali.charAt(j);
                            dor += pali.charAt(nel - j-1);
                            if(pali.charAt(j)!=pali.charAt(nel-j-1)){
                                break;
                            }
                        }
                        if (sar.equals(dor) && number.length() < nel)
                            number = pali;
                }
            }
        return number;
    }
}