package LeetCode.easy.cheat_sheet;

public class Longest_Commo_Prefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        for ( int i=0; i<strs.length; i++){
            if(strs[i].length() <= shortest.length()){
                shortest =strs[i];
            }
        }

        for (int i = 0; i <strs.length ; ) {
            if(!strs[i].startsWith(shortest)){
               shortest=shortest.substring(0,shortest.length()-1);
               i=0;
            }else{
                i++;
            }


        }


    return shortest;
    }

}
