package LeetCode.easy.cheat_sheet;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" asad sardorbek niisa qalzXisan      sda sdas   "));
    }
    public static int lengthOfLastWord(String s) {
        int a = s.length() - 1;
        int b = 0;
        while (a > 0) {
            if (s.charAt(a-1) == ' ' && b <= 0) {
                a--;

            } else {
                if (s.charAt(a-1) != ' ') {
                    b++;
                    a--;
                } else {
                    break;
                }

            }
        }


        return b;
    }
//    public static int lengthOfLastWord(String s) {
//        String[] ab= s.split(" ");
//
//        return ab[ab.length-1].length();
//
//    }

}
