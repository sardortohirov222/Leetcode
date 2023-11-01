package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-10/15/2023
 * By Sardor Tokhirov
 * Time-10:52 PM (GMT+5)
 */
public class Pascals_Triangle_119 {
    public static void main(String[] args) {
        System.out.println(new Pascals_Triangle_119().getRow(13));
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        if (rowIndex==0)
            return integerList;

        for (int i = 1; i <=rowIndex/2 ; i++) {
            integerList.add(fromTo(i+1,rowIndex)/fromTo(1,rowIndex-i));
        }
        for (int i = (rowIndex-1)/2; i >0; i--) {
            integerList.add(integerList.get(i));
        }
        integerList.add(1);
        return integerList;
    }

    public int  fromTo(int from,int to){
        int sum=1;
        for (int i = from; i <=to ; i++) {
            sum=sum*i;
        }
        return sum;
    }
}
