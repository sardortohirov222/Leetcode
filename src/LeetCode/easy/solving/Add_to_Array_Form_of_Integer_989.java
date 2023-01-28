package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Date-1/28/2023
 * Time-8:49 AM
 */
public class Add_to_Array_Form_of_Integer_989 {
        public List<Integer> addToArrayForm(int[] num, int k) {

            final LinkedList<Integer> result = new LinkedList<>();
            int len = num.length - 1;

            while(len >= 0 || k != 0){

                if(len >= 0){
                    k += num[len--];
                }

                result.addFirst(k % 10);
                k /= 10;
            }

            return result;

        }



}
