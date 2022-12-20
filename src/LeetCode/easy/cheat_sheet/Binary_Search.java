package LeetCode.easy.cheat_sheet;

public class Binary_Search {
    public static void main(String[] args) {
        Binary_Search search=new Binary_Search();
        System.out.println(search.search(new int[]{4,2,3,0},4));


    }
    public int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
//    public int search(int[] nums, int target) {
//        int a=-1;
//        for (int i = 0; i <nums.length; i++) {
//        if (nums[i]==target){
//            a=i;
//        }
//        }
//        return a;
//    }
}