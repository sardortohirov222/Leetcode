package LeetCode.easy.cheat_sheet;

public class Reverse_Bits {
    public static void main(String[] args) {
        System.out.println(reverseBits(111));
    }
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String manpar=String.valueOf(n);
        int decimal = 0;
        int a=manpar.length()-1;
        while (a>0) {
            decimal +=Integer.valueOf(manpar.substring(a,a+1))*Math.pow(2,a);
            a--;
        }

        return decimal;
    }


}
