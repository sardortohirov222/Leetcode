package LeetCode.easy;

public class Remove_Palindromic_Subsequences {
    public static void main(String[] args) {
       Remove_Palindromic_Subsequences subsequences=new Remove_Palindromic_Subsequences();
        System.out.println(subsequences.removePalindromeSub("sas"));
    }

    public int removePalindromeSub(String s) {

        return isPalindromic(s) ? 1 : 2;
    }
    public Boolean isPalindromic(String s){
        int len=s.length()-1;
        int nil=0;
        while (nil < len) {
            if (s.charAt(nil) != s.charAt(len)) {
                return false;
            }
            nil++;
            len--;
        }
        return true;
    }


}
