package LeetCode.medium.solving;

import java.util.LinkedList;

/**
 * Date-7/25/2023
 * Time-12:24 AM
 */
public class Increasing_Triplet_Subsequence_334 {
    public static void main(String[] args) {
        System.out.println(new Increasing_Triplet_Subsequence_334().increasingTriplet(new int[]{1,1,-2,6}));
    }
    public boolean increasingTriplet(int[] nums) {
        boolean hasTripleSub=false;
        int l = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;
        int def=0;
        int i=0;
        while (i<nums.length) {
            if(nums[i]==m) {i++;continue;}
            if (nums[i]<l){
                l=nums[i];
                def=m;
                m=l;
                i++;
                continue;
            }
            if (nums[i]<m){
                m=nums[i];
                i++;
                continue;
            }
            if (nums[i]>m&&l!=m&&nums[i]>def){
                hasTripleSub=true;
                break;
            }
            i++;

        }
        return hasTripleSub;
    }

}
