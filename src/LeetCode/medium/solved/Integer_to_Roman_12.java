package LeetCode.medium.solved;

/**
 * Date-8/29/2023
 * Time-6:29 AM
 */
public class Integer_to_Roman_12 {
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        while (0 < num) {
            if (num / 1000 > 0) {
                builder.append("M");
                num -= 1000;
                continue;
            }
            if (num % 1000 > 899) {
                builder.append("CM");
                num -= 900;
            }
            if (num % 1000 > 499) {
                builder.append("C");
                num -= 500;
            }
            if (num % 500 > 399) {
                builder.append("CD");
                num -= 400;
            }
            if (num / 100 > 0) {
                builder.append("C");
                num -= 100;
                continue;
            }
            if (num % 100 > 89) {
                builder.append("XC");
                num -= 90;
            }
            if (num / 50 == 1) {
                builder.append("L");
                num -= 50;
            }
            if (num > 39) {
                builder.append("XL");
                num -= 40;
            }
            if (num / 10 > 0) {
                builder.append("X");
                num -= 10;
                continue;
            }
            if (num == 9) {
                builder.append("IX");
                break;
            }
            if (num > 3) {
                if (num == 4) {
                    builder.append("IV");
                    num -= 4;
                } else {
                    builder.append("V");
                    num -= 5;
                }
            }
            if (num<4){
            builder.append("I");
            num--;
            }
        }

        return builder.toString();
    }
}

