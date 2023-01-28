package LeetCode.easy.solving;

import java.util.ArrayList;

/**
 * Date-1/28/2023
 * Time-7:53 AM
 */
public class Add_Binary_67 {

        public String addBinary(String aa, String bb) {
            char[] a=aa.toCharArray();
            char[] b=bb.toCharArray();

            StringBuffer sb=new StringBuffer();

            int i=a.length-1,j=b.length-1,s=0,t=0;

            while(j>-1 || i>-1 || t!=0){

                s=t;

                if(i>-1)
                    s+=(a[i--]-48);



                if(j>-1)
                    s+=(b[j--]-48);

                if(s>1){
                    t=1;
                    s-=2;
                }else
                    t=0;

                sb.append((char)(s+48));

            }
            return sb.reverse().toString();
        }
}
