package LeetCode.easy.solving;

/**
 * Date-1/6/2023
 * Time-8:51 AM
 */
public class Min_Cost_Climbing_Stairs_746 {
    public static void main(String[] args) {
        System.out.println(new Min_Cost_Climbing_Stairs_746().minCostClimbingStairs(new int[]{0,1,2,2}));
    }
    public int minCostClimbingStairs(int[] cost) {
        int costOf=0;
        int i=0;
        while (i<cost.length-1){
            if(i+2<cost.length&&cost[i]+cost[i+2]>cost[i+1]){
                costOf+=cost[i+1];
                i++;
            }else if (cost[i]>cost[i+1]){
                costOf+=cost[i+1];}
            else {
                costOf+=cost[i];
            }
            i++;
        }


        return costOf;
    }

}
