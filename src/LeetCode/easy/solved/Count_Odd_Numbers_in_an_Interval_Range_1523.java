package LeetCode.easy.solved;

/**
 * Date-1/12/2023
 * Time-8:10 AM
 */
public class Count_Odd_Numbers_in_an_Interval_Range_1523 {
    public int countOdds(int low, int high) {
        if(low==high&&low%2==1){
            return 1;
        }
        int odds=0;
        if (low % 2 == 1 && high % 2 == 1) {
            odds = ((high - low-1) / 2) +2;
        }
        else {
            odds=((high - low) / 2) + low % 2 + high % 2;
        }
        return odds;
    }
}
