package LeetCode.medium.solving;

/**
 * Date-7/24/2023
 * Time-11:11 PM
 */
public class Peak_Index_in_a_Mountain_Array_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int i = arr.length / 2;
        int arrLen = i;
        while (true) {
            if (arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                break;
            }
            if (arr[i]<arr[i+1]){
                i+=arrLen/2;
                arrLen /= 2;
            }else {
                i-=arrLen/2;
            }

        }
        return i;
    }
}
