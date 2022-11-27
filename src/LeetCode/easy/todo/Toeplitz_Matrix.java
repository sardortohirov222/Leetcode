package LeetCode.easy.todo;

public class Toeplitz_Matrix {

    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{{21,1},{32,521}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int b= matrix.length-1;
        int increm=0;
        int scr=0;
        boolean judging=true;
        while (b>increm){
            if (scr==matrix[0].length-1){
                scr=0;
                increm++;
                continue;
            }
            if(matrix[increm][scr]!=matrix[increm+1][scr+1]){
                return false;
            }
            scr++;

        }
        return judging;
    }

}
