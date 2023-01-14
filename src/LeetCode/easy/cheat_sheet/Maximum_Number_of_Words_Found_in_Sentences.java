package LeetCode.easy.cheat_sheet;

import java.util.HashSet;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));

    }

    public static int mostWordsFound(String[] sentences) {
        int b = 0;
        for (String a : sentences) {
            String[] aa = a.split(" ");
            if (b < aa.length) {
                b = aa.length;
            }
        }
        return b;
    }


//    public static int mostWordsFound(String[] sentences) {
//       int count=0;
//        for (int i = 0; i <sentences.length ; i++) {
//          int b=0;
//            for (String sa:  sentences[i].split("\\s")
//                 ) {
//                b++;
//            }
//            if(count<b)
//                count=b;
//        }
//        return count;
//    }

}
