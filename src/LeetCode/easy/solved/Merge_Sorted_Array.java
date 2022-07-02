package LeetCode.easy.solved;
import java.util.Arrays;
public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int a[]={3,2,4,6,1,3};
        int b[]={3,4,5,6};
        int m=4;
        int n=2;
       Merge_Sorted_Array sorted_array=new Merge_Sorted_Array();
       sorted_array.merge(a,m,b,n);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i <nums1.length ; i++) {
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);

    }


}
