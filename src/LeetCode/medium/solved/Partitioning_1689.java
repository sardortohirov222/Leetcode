package LeetCode.medium.solved;

/**
 * Date-1/6/2023
 * Time-9:45 AM
 */
public class Partitioning_1689 {
    //    27346209830709182346
    public int minPartitions(String n) {
        int i=0;
        int biggest=0;
        while (n.length()>i){
            if (n.charAt(i)>biggest){
                biggest=n.charAt(i);
            }
            i++;
        }
        return Integer.parseInt(String.valueOf((char)biggest));
    }
}
