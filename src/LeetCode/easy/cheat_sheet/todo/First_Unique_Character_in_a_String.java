package LeetCode.easy.cheat_sheet.todo;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    public static int firstUniqChar(String s) {
        String help=s;
        while (!help.equals("")){
            int helpLength=help.length();
            String a=String.valueOf(help.charAt(0));
            help=help.replaceAll(a,"");
            if(help.length()==helpLength-1){
                return s.indexOf(a);
            }
        }
        return -1;
    }
}
