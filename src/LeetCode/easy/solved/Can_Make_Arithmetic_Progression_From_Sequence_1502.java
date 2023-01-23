package LeetCode.easy.solved;

import java.util.Arrays;

public class Can_Make_Arithmetic_Progression_From_Sequence_1502 {

    public  boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
       boolean isCan=true;
       int ar=arr[1]-arr[0];
       for (int i = 2; i < arr.length; i++) {
       if(arr[i]-arr[i-1]!=ar){
            return false;
       }
       }

        return isCan;
       }
    
}
