package LeetCode.easy.solved;

/**
 * Date-3/22/2023
 * Time-3:54 AM
 */
public class Count_of_Matches_in_Tournament_1688 {
    public int numberOfMatches(int n) {
        int num=0;
        while(n>1){
            num+=n/2;
            n=(n/2)+(n%2);
        }
        return num;
    }
}
