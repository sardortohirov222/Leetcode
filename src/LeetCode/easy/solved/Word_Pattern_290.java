package LeetCode.easy.solved;

import java.util.HashMap;

/**
 * Date-1/13/2023
 * Time-9:47 AM
 */
public class Word_Pattern_290 {

        public  boolean wordPattern(String pattern, String s) {
            String[] aS = s.split(" ");
            HashMap<String, String> hashMap = new HashMap<>();
            boolean is = true;
            int i = 0;
            if (aS.length!=pattern.length()){
                return false;
            }
            for (String a : aS) {
                String pat = String.valueOf(pattern.charAt(i));
                if (hashMap.containsKey(pat)) {
                    if (!hashMap.get(pat).equals(a)) {
                        is = false;
                        break;
                    }
                } else {
                    if(hashMap.containsValue(a)){
                        is=false;
                        break;
                    }
                    hashMap.put(pat, a);
                }
                i++;
            }

            return is;
    }
}