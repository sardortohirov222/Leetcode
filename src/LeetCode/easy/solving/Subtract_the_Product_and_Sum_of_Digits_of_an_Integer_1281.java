package LeetCode.easy.solving;

/**
 * Date-1/13/2023
 * Time-8:55 AM
 */
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
    public int subtractProductAndSum(int n) {
        int i=String.valueOf(n).length();
        int sum=0;
        int mult=1;
        while (i>0){
            sum+=n%i;
            mult*=n%i;
        }
        return sum+mult;
    }
}
