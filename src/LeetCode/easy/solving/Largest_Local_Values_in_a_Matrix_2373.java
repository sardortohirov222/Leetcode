package LeetCode.easy.solving;

/**
 * Date-11/3/2023
 * By Sardor Tokhirov
 * Time-4:26 AM (GMT+5)
 */
public class Largest_Local_Values_in_a_Matrix_2373 {
    public static void main(String[] args) {

        System.out.println(new Largest_Local_Values_in_a_Matrix_2373().largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}));
    }

    public int[][] largestLocal(int[][] grid) {
        int[][] num = new int[grid.length - 2][grid.length - 2];
        int x = 0, y = 0;
        while (grid.length - 2 > y) {
            int[][] mx = new int[3][3];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int an = grid[y + i][x + j];
                    if (an > max) {
                        max = an;
                    }
                }
            }
            num[y][x] = max;
            x++;
            if (x == grid.length - 2) {
                x = 0;
                y++;
            }
        }

        return num;
    }


}
