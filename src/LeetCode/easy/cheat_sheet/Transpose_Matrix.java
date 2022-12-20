package LeetCode.easy.cheat_sheet;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5,6,7,9,0,5,6},{4,5,6,32,3,3,23,23,23,23,232},{7,8,1,2,34,4,4,4,4,32,9},{7,8,1,2,34,4,4,4,4,32,9},{7,8,1,2,34,4,4,4,4,32,9},{7,8,1,2,34,4,4,4,4,32,9},{7,8,1,2,34,4,4,4,4,32,9}};
       Transpose_Matrix transpose_matrix=new Transpose_Matrix();
        for (int[] b:transpose_matrix.transpose(a)) {
            for (int al:b
                 ) {
                System.out.println(al);
            }
        }

    }

    public int[][] transpose(int[][] matrix) {
      int[][] num=new int[matrix[0].length][matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
            num[j][i]=matrix[i][j];
            }
        }
        return num;
    }


}
