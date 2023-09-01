package LeetCode.easy.solved;


/**
 * Date-8/7/2023
 * Time-2:00 AM
 */
public class Counting_Bits_338 {

    public int[] countBits(int n) {
        int[] mum = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int bites = 0;
            int q=i;
            while (q>0){
                bites+=q%2;
                q /= 2;
            }
            mum[i]=bites;
        }
        return mum;
    }
}
