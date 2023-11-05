package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-11/5/2023
 * By Sardor Tokhirov
 * Time-5:39 AM (GMT+5)
 */
public class Lucky_Numbers_in_a_Matrix_1380 {
    public static void main(String[] args) {
        System.out.println(new Lucky_Numbers_in_a_Matrix_1380().luckyNumbers(new int[][]{{7,8},{1,2}}));
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList();
        int y = 0;
        boolean fuckIDontHaveBetterIdeaThanThis=false;
        while (y < matrix.length) {
            int min = Integer.MAX_VALUE;
            int j = 0;
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[y][i] < min) {
                    min = matrix[y][i];
                    j = i;
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > min) {
                    fuckIDontHaveBetterIdeaThanThis=true;
                    break;
                }
            }
            y++;
            if (fuckIDontHaveBetterIdeaThanThis){
                fuckIDontHaveBetterIdeaThanThis=false;
                continue;
            }
            list.add(min);

        }
        return list;
    }
}
