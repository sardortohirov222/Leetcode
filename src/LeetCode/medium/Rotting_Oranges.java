package LeetCode.medium;

public class Rotting_Oranges {
    public static void main(String[] args) {

        System.out.println(orangesRotting(new int[][]{{1, 1, 1}, {1, 1, 0}, {0, 1, 1}}));

    }

    public static int orangesRotting(int[][] grid) {
     int[][] mon=new int[grid.length][grid.length];
       int asa=0;
        for (int i = 0; i < mon.length;) {
            mon[asa][i]=grid[asa][i];
            i++;
            if(i== mon.length&&asa<mon.length-1){
                asa++;
                i=0;
            }

        }
        int a = 0;
        int i = 0;
        int sana = 0;
        int kan=0;
        int mon1=0;
        while (sana<=grid.length ) {

            boolean comp = grid[a][i] == 2;
            if (comp && i != grid.length - 1 && grid[a][i + 1] == 1) {
                mon[a][i + 1] = 2;
                kan++;
            }
            if (comp && a != grid.length - 1 && grid[a + 1][i] == 1) {
                mon[a + 1][i] = 2;
                kan++;
            }
            if (comp && a != 0 && grid[a - 1][i] == 1) {
                mon[a - 1][i] = 2;
                kan++;
            }
            if (comp && i != 0 && grid[a][i - 1] == 1) {
                mon[a][i - 1] = 2;
                kan++;
            }
            i++;
            if (i >= grid.length) {
                i = 0;
                a++;
            }
            if(a>=grid.length&&kan>0){
                kan=0;
                mon1++;
                sana=-1;
                grid=mon;
            }
            if (a >= grid.length) {
                a = 0;
                sana++;
            }


        }
        for (int[] con:grid
             ) {
            for (int m:con
                 ) {
                if(m==1){
                   return -1;
                }
            }
        }

        return mon1;

    }


}
