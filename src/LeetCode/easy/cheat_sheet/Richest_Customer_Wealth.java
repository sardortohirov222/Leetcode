package LeetCode.easy.cheat_sheet;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {

        Richest_Customer_Wealth n=new Richest_Customer_Wealth();
        System.out.println(n.maximumWealth(new int[][]{{1,2,3},{3,4,7},{2,3,4,6,7}}));
    }

    public int maximumWealth(int[][] accounts) {
        int big = 0;
        for (int[] ab : accounts
        ) {
            int a = 0;
            for (int as : ab
            ) {
                a += as;
            }
            if (a > big) {
                big = a;
            }
        }
        return big;
    }

}
