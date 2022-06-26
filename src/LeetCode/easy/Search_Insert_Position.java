package LeetCode.easy;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Search_Insert_Position search_insert_position=new Search_Insert_Position();
        System.out.println(search_insert_position.searchInsert(new int[]{1,3,5,6},13));

    }

    public int searchInsert(int[] nums, int target) {
        int index=nums.length;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                index=i;
                break;
            }
            if (nums[i]>target){
                index=i;
                break;
            }

        }
        return index;
    }
}
