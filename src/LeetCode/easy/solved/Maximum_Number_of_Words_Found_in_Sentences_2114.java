package LeetCode.easy.solved;

/**
 * Date-1/14/2023
 * Time-11:25 AM
 */
public class Maximum_Number_of_Words_Found_in_Sentences_2114 {
    public  int mostWordsFound(String[] sentences) {
        int b = 0;
        for (String a : sentences) {
            String[] aa = a.split(" ");
            if (b < aa.length) {
                b = aa.length;
            }
        }
        return b;
    }
}
