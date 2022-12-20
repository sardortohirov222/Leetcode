package LeetCode.easy.cheat_sheet;

import java.util.Arrays;

public class Array_Partition_I {

    public static void main(String[] args) {
        Array_Partition_I array_partition_i=new Array_Partition_I();
        System.out.println(array_partition_i.arrayPairSum(new int[]{1,4,3,2}));
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int a = 0, b = 0;
        while (a < nums.length) {
            if (nums[a] > nums[a + 1]) {
                b += nums[a + 1];
                a=a+2;
            } else {
                b += nums[a];
                a=a+2;
            }
        }


        return b;
    }
//    public void bubbleSort(int[] array) {
//        boolean swapped = true;
//        int j = 0;
//        int tmp;
//        while (swapped) {
//            swapped = false;
//            j++;
//            for (int i = 0; i < array.length - j; i++) {
//                if (array[i] > array[i + 1]) {
//                    tmp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = tmp;
//                    swapped = true;
//                }
//            }
//        }
//    }
}
