package LeetCode.easy.solving;

/**
 * Date-1/18/2023
 * Time-9:14 AM
 */
public class Matrix_Diagonal_Sum_1572 {

    public int diagonalSum(int[][] mat) {
        int leftSideSum = 0;
        int rightSideSum = 0;
        int lenR = mat.length - 1;
        int lenL = 0;
        while (lenR >= 0) {
            leftSideSum += mat[lenL][lenL];
            rightSideSum += mat[lenL][lenR];
            lenL++;
            lenR--;
        }
        if (mat.length % 2 == 1) {
            int i = mat.length / 2;
            leftSideSum -= mat[i][i];
        }
        return leftSideSum + rightSideSum;
    }
}
