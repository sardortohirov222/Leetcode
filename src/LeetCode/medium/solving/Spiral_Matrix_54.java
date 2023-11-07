package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-11/5/2023
 * By Sardor Tokhirov
 * Time-11:23 AM (GMT+5)
 */
public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        System.out.println(new Spiral_Matrix_54().spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int lenX = matrix[0].length - 1, lenY = matrix.length - 1;
        int i = 0;
        int p=(lenX + 1) * (lenY + 1);
        if (p%2==1) p--;
        while (list.size() < p) {
            for (int x = i; x < lenX - i; x++) {
                list.add(matrix[i][x]);
            }
            for (int y = i; y < lenY - i; y++) {
                list.add(matrix[y][lenX - i]);
            }
            for (int x = lenX - i; x > i; x--) {
                list.add(matrix[lenY - i][x]);
            }
            for (int y = lenY - i; y >i; y--) {
                list.add(matrix[y][i]);
            }
            i++;
        }
        if ((lenX + 1) * (lenY + 1)%2==1){
            list.add(matrix[lenY/2][lenX/2]);
        }
        return list;
    }
}
