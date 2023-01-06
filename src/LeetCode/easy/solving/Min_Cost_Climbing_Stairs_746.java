package LeetCode.easy.solving;

/**
 * Date-1/6/2023
 * Time-8:51 AM
 */
public class Min_Cost_Climbing_Stairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int price=0;
        int i = -1;
        while (i < cost.length-2) {
            if (cost[i+1] < cost[i+2]&&cost[i+2]>cost[i+3]) {
                price=price+cost[i+1];
                i++;
            }else {
                price=price+cost[i+2];
                i+=2;
            }

        }
        return price;
    }

}
