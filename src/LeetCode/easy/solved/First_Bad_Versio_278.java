package LeetCode.easy.solved;

/**
 * Date-1/3/2023
 * Time-11:19 AM
 */
public class First_Bad_Versio_278 {

    public int firstBadVersion(int n) {
        return finder(0,n);
    }
    public int finder(int start, int end) {
        int endDemo=(end-start)/2+start;
        if (end-start==1){
            return end;
        } else if (isBadVersion(endDemo)){
            return finder(start,endDemo);
        } else {
            return finder(endDemo,end);
        }
    }
    boolean isBadVersion(int version){
        return version>=8;
    };
}
