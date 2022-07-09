package LeetCode.easy.solved;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}));

    }

    public static int mostWordsFound(String[] sentences) {
        int a=0;
        int i=0;
        int ab=0;
        int s=0;
        while (i<sentences.length){
           if(sentences[i].charAt(ab)==' ')
               s++;
           if (s>a)
               a=s;
            ab++;
           if(sentences[i].length()<=ab){
               s=0;
               ab=0;
               i++;
           }

        }


        return a+1;
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
