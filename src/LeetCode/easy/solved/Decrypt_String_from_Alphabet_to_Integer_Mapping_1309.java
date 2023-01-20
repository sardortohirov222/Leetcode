package LeetCode.easy.solved;

import java.util.HashMap;

/**
 * Date-1/20/2023
 * Time-8:34 AM
 */
public class Decrypt_String_from_Alphabet_to_Integer_Mapping_1309 {
    public  String freqAlphabets(String s) {
        HashMap<String,Character> hashMap=new HashMap<>();
        StringBuilder wtf=new StringBuilder();
        int num=0;
        for (int i = 97; i <123 ; i++) {
            num++;
            hashMap.put(num+"", (char) i);
        }
        for (int i = 0; i <s.length() ; i++) {
            if (s.length()>i+2&&s.charAt(i+2)=='#'){
                wtf.append(hashMap.get(s.substring(i,i+2)));
                i+=2;
            }else {
            wtf.append(hashMap.get(s.charAt(i)+""));}
        }
        return wtf.toString();
    }
}
