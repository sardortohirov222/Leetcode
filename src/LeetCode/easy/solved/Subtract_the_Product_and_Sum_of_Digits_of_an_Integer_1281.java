package LeetCode.easy.solved;

/**
 * Date-1/13/2023
 * Time-8:55 AM
 */
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
    public static int subtractProductAndSum(int n) {
        int i = (int) Math.pow(10, String.valueOf(n).length() - 1);
        int sum = 0;
        int mult = 1;
        while (i > 0) {
            int a = n / i;
            sum += a;
            mult *= a;
            n = n % i;
            i /= 10;
        }
        return mult - sum;
    }
}
