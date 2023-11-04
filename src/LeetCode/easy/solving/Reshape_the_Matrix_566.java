package LeetCode.easy.solving;

/**
 * Date-11/4/2023
 * By Sardor Tokhirov
 * Time-5:15 AM (GMT+5)
 */
public class Reshape_the_Matrix_566 {
    public static void main(String[] args) {
        System.out.println(new Reshape_the_Matrix_566().matrixReshape(new int[][]{{1, 2},{ 3, 4}}, 4, 1));
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int x = 0, y = 0;
        int[][] mx = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++,x++) {
                mx[y][x] = mat[i][j];
                if (x == c ) {
                    y++;
                    x = 0;
                }
            }
        }

        return mx;
    }
}
