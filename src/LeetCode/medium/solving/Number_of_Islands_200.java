package LeetCode.medium.solving;

/**
 * Date-1/9/2023
 * Time-8:13 AM
 */
public class Number_of_Islands_200 {
    public static void main(String[] args) {
        Number_of_Islands_200 n = new Number_of_Islands_200();
//        [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
        System.out.println(n.numIslands(new char[][]{{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}}));
    }

    public int numIslands(char[][] grid) {
        int counter = -1;
        int x = 0;
        int y = 0;
        counter++;
        while (y < grid.length) {
            if (grid[y][x] == 1) {
                counter=counter+1;
                grid[y][x] = 0;
                grid = convertIslandToWater(grid, y, x);
            }
            x++;
            if (x == grid[0].length) {
                x = 0;
                y++;
            }
        }

        return counter;
    }

   public char[][] convertIslandToWater(char[][] gridChars, int indeY, int x) {
        int lengrid = gridChars.length - 1;
        int len = gridChars[0].length - 1;
        if (x > 0 && gridChars[indeY][x - 1] == 1) {
            gridChars[indeY][x - 1] = 0;
            gridChars = convertIslandToWater(gridChars, indeY, x - 1);
        }
        if (indeY > 0 && gridChars[indeY - 1][x] == 1) {
            gridChars[indeY - 1][x] = 0;
            gridChars = convertIslandToWater(gridChars, indeY - 1, x);
        }
        if (x < len && gridChars[indeY][x + 1] == 1) {
            gridChars[indeY][x + 1] = 0;
            gridChars = convertIslandToWater(gridChars, indeY, x + 1);
        }
        if (indeY < lengrid && gridChars[indeY + 1][x] == 1) {
            gridChars[indeY + 1][x] = 0;
            gridChars = convertIslandToWater(gridChars, indeY + 1, x);
        }
        return gridChars;
    }
}
