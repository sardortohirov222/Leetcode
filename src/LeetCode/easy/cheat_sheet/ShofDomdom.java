package LeetCode.easy.cheat_sheet;

public class ShofDomdom {

    public static void main(String[] args) {
        System.out.println(restoreString("sardorbek",new int[]{3,2,1,0,5,4,8,6,7}));
    }
    //drasrokbe
    //drasroekb
    public static String restoreString(String s, int[] indices) {
        String ab="";
        for (int indice:indices
        ) {
            ab=ab+s.charAt(indice);
        }
        return ab;
    }
}
