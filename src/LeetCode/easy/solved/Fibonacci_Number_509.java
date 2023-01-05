package LeetCode.easy.solved;

/**
 * Date-1/5/2023
 * Time-8:45 AM
 */
public class Fibonacci_Number_509 {
    public int fib(int n) {
        int per=0;
        int cur=1;
        int i=1;
        while (i<n){
            cur=cur+per;
            per=cur-per;
            i++;
        }
        return per;
    }
}
