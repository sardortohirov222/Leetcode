package LeetCode.easy.solved;

/**
 * Date-8/5/2023
 * Time-11:21 PM
 */
public class Find_the_Highest_Altitude_1732 {
    public int largestAltitude(int[] gain) {
        int num = 0, bigOne = 0;
        int i = 0;
        while (i < gain.length) {
            num += gain[i];
            if (num > bigOne) bigOne = num;
        }
        return bigOne;
    }
}
