package LeetCode.medium.solving;

import java.util.Arrays;

/**
 * Date-8/11/2023
 * Time-2:21 AM
 */
public class Coin_Change_322 {
    public static void main(String[] args) {
        System.out.println(new Coin_Change_322().coinChange(new int[]{2},3));
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int minNumOfCoins=0;
        int change=amount;
        for (int i = coins.length-1; i >=0 ; i--) {
            minNumOfCoins+=change/coins[i];
            change %= coins[i];
        }
        return change==0? minNumOfCoins:-1;
    }
}
