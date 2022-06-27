package LeetCode.easy;

import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        Backspace_String_Compare string_compares=new Backspace_String_Compare();
        System.out.println(string_compares.backspaceCompare("xywrrmp","xywrrmup"));
    }
    public boolean backspaceCompare(String s, String t) {
       int count1=0;
       int count2=0;
       int len=0;
       int nil=0;
       int a=s.length()-1;
       int b=t.length()-1;
       while (len!=a||nil!=b){
           if(s.charAt(len)=='#'){
               count1++;
           }
           if(t.charAt(nil)=='#'){
               count2++;
           }
           if (len!=a){
               len++;
           }
           if(nil!=b){
               nil++;
           }
       }


        return count1==count2;
    }

}
