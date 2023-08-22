package LeetCode.easy.solved;

/**
 * Date-8/21/2023
 * Time-11:24 PM
 */
public class Excel_Sheet_Column_Title_168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 26) {
            int n = columnNumber % 26;
            builder.append(n == 0 ? "Z" : Character.toString(n + 64));
            columnNumber = (columnNumber - 1) / 26;
        }
        builder.append(columnNumber == 0 ? "Z" : Character.toString(columnNumber + 64));

        return builder.reverse().toString();
    }
}
