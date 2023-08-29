package LeetCode.easy.solved;

import java.util.HashMap;

/**
 * Date-8/29/2023
 * Time-4:18 AM
 */
public class Roman_to_Integer_13 {

    public int romanToInt(String s) {
        HashMap<Character,Integer> nums=new HashMap<>();
        nums.put('I',1);
        nums.put('V',5);
        nums.put('X',10);
        nums.put('C',100);
        nums.put('L',50);
        nums.put('D',500);
        nums.put('M',1000);

        int i=0;
        int sum=0;
        while (i<s.length()){
            int num=nums.get(s.charAt(i)),num2=nums.get(s.charAt(i+1));
            if (i<s.length()-1&&nums.get(s.charAt(i))<nums.get(s.charAt(i+1))){
                sum+=nums.get(s.charAt(i+1))-nums.get(s.charAt(i));
            i++;
            }else {
                sum+=nums.get(s.charAt(i));
            }
            i++;
        }
        return sum;
    }
}
