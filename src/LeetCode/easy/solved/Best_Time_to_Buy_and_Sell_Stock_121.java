package LeetCode.easy.solved;

/**
 * Date-12/31/2022
 * Time-8:58 AM
 */
public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public  int maxProfit(int[] prices) {
        int minimum=prices[0];
        int stock=0;
        int maxIncr=1;
        while (maxIncr<prices.length){
            if(prices[maxIncr]<minimum){
                minimum=prices[maxIncr];
            }
            if (prices[maxIncr]-minimum>stock){
                stock=prices[maxIncr]-minimum;


            }

            maxIncr++;
        }
        return stock;
    }
}
