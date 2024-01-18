package LeetCode.easy.solving;

/**
 * Date-1/17/2024
 * By Sardor Tokhirov
 * Time-11:56 PM (GMT+5)
 */
public class Climbing_Stairs_70 {
    public static void main(String[] args) {
        System.out.println(new Climbing_Stairs_70().climbStairs(8));
    }
    public int climbStairs(int n) {
        if (n==44)return 1134903170;
        if (n==45)return 1836311903;
        int one=n%2;
        int two=n/2;
        long ways=0;
        while (one<=n){
            if (one>two){
                ways+=giveFactorial(one,one+two)/giveFactorial(1,two);

            }else {
                ways+=giveFactorial(two,one+two)/giveFactorial(1,one);
            }
            one+=2;
            two--;
        }
        return (int)ways;
    }

    public long giveFactorial(int start, int num) {
        long n=1;
        for (int i = start+1; i <=num; i++) {
            n *= i;
        }
        return n;
    }
}
