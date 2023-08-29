package LeetCode.medium.solved;

/**
 * Date-8/29/2023
 * Time-12:35 AM
 */
public class Minimum_Penalty_for_a_Shop_2483 {
    public int bestClosingTime(String customers) {
        int i = 0, n = 0;
        int minPenalty = 0;
        int currentFine = 0;
        while (i < customers.length()) {
            if (customers.charAt(i) == 'Y') currentFine++;
            else currentFine--;
            if (currentFine > minPenalty) {
                minPenalty = currentFine;
                n = i+1;
            }
            i++;
        }
        return n;
    }
}
