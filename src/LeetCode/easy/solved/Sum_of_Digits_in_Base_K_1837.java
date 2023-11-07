package LeetCode.easy.solved;

/**
 * Date-11/7/2023
 * By Sardor Tokhirov
 * Time-11:05 AM (GMT+5)
 */
public class Sum_of_Digits_in_Base_K_1837 {
//    public int sumBase(int n, int k) {
//        int num=0;
//        while (n>0){
//            num=num+n%k;
//            n=n/k;
//        }
//        return num;
//    }
    public int sumBase(int n, int k) {
        if (n==0)return  0;
        return n%k+sumBase(n/k,k);
    }
}
