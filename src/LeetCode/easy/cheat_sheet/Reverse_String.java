package LeetCode.easy.cheat_sheet;

public class Reverse_String {
    public static void main(String[] args) {
        Reverse_String string=new Reverse_String();
        string.reverseString(new char[]{'o'});
    }
    public void reverseString(char[] s) {
        int i=s.length-1;
        int a=0;
        char ol=0;
        while (a<s.length/2){
           ol=s[i];
            s[i]=s[a];
            s[a]=ol;
            i--;
            a++;
        }
    }
}
