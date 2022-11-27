import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sardorbek {

    public static void main(String[] args) {
        System.out.println("Hello World !");
    }
    public int maximum69Number (int num) {
      int sum=1;
        for(int i=1000;i>=10;i=i/10){
           if(num/i==0)
               continue;
           if(num/i==6){
               return (9*i)+(num-(num/i));
           }
           sum =num/i;
        }
        return sum;
        
    }
}






















































//    }
//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        int i = a.length() - 1, j = b.length() -1, carry = 0;
//        while (i >= 0 || j >= 0) {
//            int sum = carry;
//            if (j >= 0) sum += b.charAt(j--) - '0';
//            if (i >= 0) sum += a.charAt(i--) - '0';
//            sb.append(sum % 2);
//            carry = sum / 2;
//        }
//        if (carry != 0) sb.append(carry);
//        return sb.reverse().toString();
////
////}
//
//
//}