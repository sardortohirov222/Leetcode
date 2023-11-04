package LeetCode.easy.solved;

/**
 * Date-11/4/2023
 * By Sardor Tokhirov
 * Time-11:38 AM (GMT+5)
 */
public class Transpose_Matrix_867 {
    public int[][] transpose(int[][] matrix) {
        int x=0,y=0,lenX=matrix[0].length,lenY=matrix.length;
        int[][] newArr = new int[lenX][lenY];
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                newArr[y][x] = matrix[j][i];
                x++;
                if (x == lenY) {
                    x = 0;
                    y++;
                }
            }
        }
        return  newArr;
    }
}
