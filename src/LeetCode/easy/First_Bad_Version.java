package LeetCode.easy;

public class First_Bad_Version {
    public static void main(String[] args) {
        First_Bad_Version version=new First_Bad_Version();
        System.out.println(version.firstBadVersion(2126753390));

    } public int firstBadVersion(int n) {
        if(n==1) return 1;
        int start = 1;
        int end = n;
        int badV = -1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(isBadVersion(mid)){
                badV = mid;
                end = mid -1;
            }else{
                start=mid + 1;
            }

        }

        return badV;

    }


//    public int firstBadVersion(int n) {
//    int kon=n;
//    int g=0;
//    while (kon>=0){
//       if( isBadVersion(kon)?!isBadVersion(kon=kon-2):true){
//        if (isBadVersion(kon+1)){
//            g=kon+1;
//            break;
//        } else{
//            g=kon;
//            break;
//        }}
//
//    }
//     return  g;
//
//    }
    boolean isBadVersion(int version){
        return version>=1702766719;
    }
}
