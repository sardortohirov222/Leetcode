package LeetCode.easy.solved;

public class Sign_of_the_Product_of_an_Array_1822 {
    public int arraySign(int[] nums) {
        int product=1;
        for(int num:nums){
           if(num<0){
            product=-1;
           }else if(num==0){
            return 0;
           }
        }
        return product;
    }
    }
    
