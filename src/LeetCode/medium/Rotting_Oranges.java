package LeetCode.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Rotting_Oranges {
    public static void main(String[] args) {
        Rotting_Oranges rotting_oranges = new Rotting_Oranges();
        System.out.println(rotting_oranges.orangesRotting(new int[][]{{0,1

        }}));

    }

    public int orangesRotting(int[][] grid) {
        if (grid.length <= 1) {
            int i = 0;
            int[][] copy_end = nimaDisan(grid);
            int counter = 0;
            int counter_time = 0;
            while (grid[0].length > i) {
                if (grid[0][i] == 2 && i != grid[0].length && grid[0][i + 1] == 1) {
                    copy_end[0][i + 1] = 2;
                    counter++;
                }
                if (grid[0][i] == 2 && i != 0 && grid[0][i - 1] == 1) {

                    copy_end[0][i - 1] = 2;
                    counter++;
                }
                i++;
                if (i >= grid[0].length && counter != 0) {
                    i = 0;
                    counter = 0;
                    grid = nimaDisan(copy_end);
                    counter_time++;
                }
            }
            for (int j = 0; j < copy_end.length; j++) {
                if (copy_end[0][j] == 1) return -1;
            }
            return counter_time;

        }

        int[][] copy_end = nimaDisan(grid);
        int x = 0;
        int y = 0;
        int counter = 0;
        int counter_time = 0;
        while (y < grid.length) {
            if (grid[y][x] == 2) {
                if (x != 0 && grid[y][x - 1] == 1) {
                    copy_end[y][x - 1] = 2;
                    counter++;
                }
                if (y != 0 && grid[y - 1][x] == 1) {
                    copy_end[y - 1][x] = 2;
                    counter++;
                }
                if (x + 1 != grid.length && grid[y][x + 1] == 1) {
                    copy_end[y][x + 1] = 2;
                    counter++;
                }
                if (y + 1 != grid.length && grid[y + 1][x] == 1) {
                    copy_end[y + 1][x] = 2;
                    counter++;
                }
            }
            x++;

            if (x == grid.length) {
                x = 0;
                y++;
            }
            if (y == grid.length && counter == 0) {
                break;
            }
            if (counter > 0 && y == grid.length) {
                counter = 0;
                grid = nimaDisan(copy_end);
                counter_time++;
                y = 0;
            }

        }


        return suylaBottam(copy_end) == -1 ? -1 : counter_time;


    }

    public int suylaBottam(int[][] copy_end) {
        int a = 0;
        int as = 0;
        for (int i = 0; i < copy_end.length; ) {
            if (copy_end[as][i] == 1) {
                a = -1;
                break;
            }
            i++;
            if (i == copy_end.length && as < copy_end.length - 1) {
                as++;
                i = 0;
            }
        }
        return a;
    }

    public int[][] nimaDisan(int[][] grid) {
        int[][] copy_end = new int[grid.length][grid[0].length];
        int asa = 0;
        for (int i = 0; i < copy_end[0].length; ) {
            copy_end[asa][i] = grid[asa][i];
            i++;
            if (i == copy_end.length && asa < copy_end.length - 1) {
                asa++;
                i = 0;
            }
        }
        return copy_end;
    }


}


// java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//        at line 9, Solution.orangesRotting
//        at line 54, __DriverSolution__.__helper__
//        at line 84, __Driver__.main
