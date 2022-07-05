package LeetCode.easy.solved;

public class Remove_All_Adjacent_Duplicates_In_String {

    public static void main(String[] args) {
//        System.out.println(removeDuplicates("sardor"));
    }

    public  String removeDuplicates(String s) {
        String a = s;
        int i = 1;
        while (i < a.length()) {
            int non = a.length();
            if(a.charAt(i-1)==a.charAt(i)){
                a=a.replaceAll(a.charAt(i-1)+""+a.charAt(i),"");
            if(i!=1) i=i-1;
            }else {
                i++;
            }
        }
        return a;
    }


}
