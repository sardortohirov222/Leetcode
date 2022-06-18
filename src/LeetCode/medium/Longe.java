package LeetCode.medium;

public class Longe {
    public static void main(String[] args) {
        Longe longest_palindrom_substring = new Longe();
        System.out.println(longest_palindrom_substring.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

    public String longestPalindrome(String s) {
        String number = "";
        int len = s.length();
        int k=0;
        for (int lon = k; lon <= len; lon++) {
            String pali = s.substring(k, lon);
            int nel = pali.length();
            String sar = "";
            String dor = "";
            for (int j = 0; j < (nel + 1) / 2; j++) {
                sar += pali.charAt(j);
                dor += pali.charAt(nel - j - 1);
            }
            if (sar.equals(dor) && number.length() < nel)
                number = pali;
            if(lon==len){
                k++;
                lon=k;
            }

        }
        return number;
    }


}
