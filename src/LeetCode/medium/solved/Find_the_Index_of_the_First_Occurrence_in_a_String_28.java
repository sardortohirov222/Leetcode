package LeetCode.medium.solved;

/**
 * Date-3/2/2023
 * Time-6:09 PM
 */
public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

    public int strStr(String haystack, String needle) {
        int a = haystack.indexOf(needle);
        return a == -1 ? -1 : a;
    }
}
