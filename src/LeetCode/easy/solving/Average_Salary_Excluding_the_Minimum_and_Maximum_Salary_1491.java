package LeetCode.easy.solving;

import java.util.Arrays;

/**
 * Date-1/12/2023
 * Time-8:44 AM
 */
public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{1000,1500,3500,4000,5500}));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double average=0;
        int lenX=1;
        int lenY= salary.length-2;
        int a=0;
        while (lenX<=lenY){
            average += (salary[lenX]+salary[lenY])/2;
            lenX++;
            lenY--;
            a++;
        }

        double sa=(average/a);
        return sa;
    }

}
