package LeetCode.easy.todo;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

        System.out.println(maxProfit(new int[]{1,2,3}));
    }
    public  static int maxProfit(int[] prices) {
        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {

            if(min<prices[i])
                max=Math.max(prices[i]-min,max);
            else
                min=prices[i];
        }
        return max;
    }
//    public static int maxProfit(int[] prices) {
//        int minimum=prices[0];
//        int stock=0;
//        int maxIncr=1;
//        while (maxIncr<prices.length){
//            if(prices[maxIncr]<minimum){
//                minimum=prices[maxIncr];
//            }
//            if (prices[maxIncr]-minimum>stock){
//                stock=prices[maxIncr]-minimum;
//            }
//            maxIncr++;
//        }
//
//     return stock;
//    }
}
