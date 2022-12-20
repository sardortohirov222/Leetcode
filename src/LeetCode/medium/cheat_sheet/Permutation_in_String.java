package LeetCode.medium.cheat_sheet;

import java.util.Arrays;

public class Permutation_in_String {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] arr1=new int[26];
        int[] arr2= new int[26];

        for(int i=0;i<s1.length();i++)
        {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr1,arr2)) return true;
        int st=0;
        int end=s1.length();

        while(end<s2.length()){
            arr2[s2.charAt(st)-'a']--;
            arr2[s2.charAt(end)-'a']++;

            if(Arrays.equals(arr1,arr2)) return true;
            st++;
            end++;
        }

        return false;
    }


//    static   HashSet set = new HashSet<>();
//    public static void main(String[] args) {
//        Permutation_in_String string=new Permutation_in_String();
//        System.out.println(checkInclusion("ccc","cbac"));
//    }
//
//        public static boolean checkInclusion(String s1, String s2) {
//            permutation("",s1);
//            boolean as=false;
//            for (int i = 0; i <= s2.length()-s1.length(); i++) {
//               String q=s2.substring(i,i+s1.length());
//                if (set.contains(q)){
//                    as=true;
//                    break;
//                }
//            }
//            return as;
//      }
//    private static void permutation(String prefix, String str) {
//        int n = str.length();
//        if (n == 0) set.add(prefix);
//        else {
//            for (int i = 0; i < n; i++)
//                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
//        }
//    }
}
