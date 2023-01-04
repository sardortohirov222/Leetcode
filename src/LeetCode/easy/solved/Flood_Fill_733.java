package LeetCode.easy.solved;

/**
 * Date-1/4/2023
 * Time-12:13 AM
 */
public class Flood_Fill_733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int i= image[sr][sc];
        if(color==i){
            return image;
        }
        image[sr][sc] = color;
        return colorSetter(image, sr, sc, color, i);
    }

    public int[][] colorSetter(int[][] image, int sr, int sc, int color, int pastColor) {
//        up
        if (sr > 0 && image[sr - 1][sc] == pastColor) {
            image[sr - 1][sc] = color;
            image = colorSetter(image, sr - 1, sc, color, pastColor);
        }
//        down
        if (sr + 1 < image.length && image[sr + 1][sc] == pastColor) {
            image[sr + 1][sc] = color;
            image = colorSetter(image, sr + 1, sc, color, pastColor);
        }
//        left
        if (sc  > 0 && image[sr][sc - 1] == pastColor) {
            image[sr][sc - 1] = color;
            image = colorSetter(image, sr, sc - 1, color, pastColor);
        }
//        right
        if (sc + 1 < image[0].length && image[sr][sc + 1] == pastColor) {
            image[sr][sc + 1] = color;
            image = colorSetter(image, sr, sc+1, color , pastColor);
        }
        return image;
    }
}