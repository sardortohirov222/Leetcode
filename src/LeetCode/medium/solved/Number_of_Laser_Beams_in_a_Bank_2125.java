package LeetCode.medium.solved;

/**
 * Date-1/8/2024
 * By Sardor Tokhirov
 * Time-8:51 AM (GMT+5)
 */
public class Number_of_Laser_Beams_in_a_Bank_2125 {
    public int numberOfBeams(String[] bank) {
        int temp = 0;
        int laser = 0;
        for (String s : bank) {
            int num = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') num++;
            }
            laser += temp * num;
            if (num != 0) temp = num;
        }
        return laser;
    }
}
