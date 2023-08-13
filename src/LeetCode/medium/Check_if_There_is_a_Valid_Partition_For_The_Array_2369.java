package LeetCode.medium;

/**
 * Date-8/12/2023
 * Time-11:41 PM
 */
public class Check_if_There_is_a_Valid_Partition_For_The_Array_2369 {
    //Karochchi oson misol bir marta uylab boshidan yoz meni asabim qogani ga yemadi !
    public static void main(String[] args) {
        System.out.println( new Check_if_There_is_a_Valid_Partition_For_The_Array_2369().validPartition(new int[]{473928,473929,473930}));
    }


    public boolean validPartition(int[] nums) {
        if (nums.length<4){
            if (nums.length==2){
                return nums[0]==nums[1];
            }else {
                return nums[0]==nums[1]-1&&nums[2]==nums[1]+1;
            }
        }
        int i = 0;
        int validAmount = 0;
        int len = nums.length - 1;
        while (i < len && validAmount != 2) {
            if (nums[i] == nums[i + 1]) {
                i++;
                validAmount++;
            } else if (i+1<len&&nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
                if (i + 2 < len && nums[i + 2] + 1 == nums[i + 3]) {
                    i += 3;
                    continue;
                }
                i += 2;
                validAmount++;
            }
            i++;
        }

        return validAmount == 2;
    }
}
