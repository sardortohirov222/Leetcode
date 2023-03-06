package LeetCode.easy.solved;

import java.util.ArrayList;

/**
 * Date-3/5/2023
 * Time-5:51 PM
 */
public class Kth_Missing_Positive_Number_1539 {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i=1;
        //    In here we are looping from 1 to beginning integer of array   fro ex: arr=[3,4,6]   looping: 1, 2, 3
        for (int j = 1; j < arr[0]; j++) {
            arrayList.add(j);
        }
        while (i<arr.length&&arrayList.size()<k){
            for (int j = arr[i-1]+1; j < arr[i]; j++) {
                arrayList.add(j);
            }
            i++;
        }
        //  In here we are adding extra integers because if k > size of missed arrays we need to add complication
        if (arrayList.size()<k){
            return arr[arr.length-1]+k-arrayList.size();
        }
        return arrayList.get(k-1);
    }
}
