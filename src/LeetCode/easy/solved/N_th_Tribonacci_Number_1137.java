package LeetCode.easy.solved;

/**
 * Date-1/30/2023
 * Time-9:58 AM
 */
public class N_th_Tribonacci_Number_1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int i = 1;
        int pastNum = 0;
        int newNum = 1;
        int countNum = 1;
        int def = 0;
        n--;
        while (n > i) {
            def = pastNum;
            pastNum = newNum;
            newNum = countNum;
            countNum = countNum + pastNum + def;
            i++;
        }
        return countNum;
    }
}
