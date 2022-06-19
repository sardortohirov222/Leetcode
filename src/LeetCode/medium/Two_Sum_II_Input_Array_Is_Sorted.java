package LeetCode.medium;

public class Two_Sum_II_Input_Array_Is_Sorted {

    public static void main(String[] args) {
        Two_Sum_II_Input_Array_Is_Sorted is_sorted = new Two_Sum_II_Input_Array_Is_Sorted();
        for (int a : is_sorted.twoSum(new int[]{2,3,4},6 )) {
            System.out.println(a);
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0 ;
        int end = numbers.length - 1;
        while(start<=end){
            int leftNum = numbers[start];
            int rightNum = numbers[end];
            if((leftNum + rightNum ) < target ){
                start++;
            }
            if((leftNum + rightNum ) > target ){
                end--;
            }
            if((leftNum + rightNum ) == target ){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
        }
        return ans;
    }}
//    public int[] twoSum(int[] numbers, int target) {
//        int num[] = new int[2];
//        int imb = 0;
//        int jak = 0;
//        int xon=numbers.length-1;
//        while (imb != xon) {
//            if (numbers[imb] + numbers[jak] == target) {
//             if(imb == jak){
//                 if (xon == jak) {
//                     imb++;
//                     jak = imb;
//                 }
//                 jak++;
//                 continue;
//             }
//                num[0] = imb + 1;
//                num[1] = jak + 1;
//                break;
//            }
//
//            if (xon == jak) {
//                imb++;
//                jak = imb;
//            }
//            jak++;
//        }
//        return num;
//    }
//
//}






//    public int[] twoSum(int[] numbers, int target) {
//        int num[] = new int[2];
//        int imb = 0;
//        int jak = 0;
//        int xon=numbers.length-1;
//        while (imb != xon) {
//            if (numbers[imb] + numbers[jak] == target||xon == jak) {
//                if(xon == jak){
//                    imb++;
//                    jak = imb;
//                }
//
//
//              if(numbers[imb] + numbers[jak] == target){
//                num[0] = imb + 1;
//                num[1] = jak + 1;
//                break;}
//                if(imb == jak){
//                    jak++;continue;
//                }
//            }
//            jak++;
//        }
//        return num;
//    }
//}
//





//    private int[] twoSum(int[] numbers, int target) {
//        int ns[] = new int[2];
//        int i = 0;
//        int j = 0;
//        while (i != numbers.length-1) {
//            if (numbers[i] + numbers[j] == target && i != j) {
//                ns[0] = i + 1;
//                ns[1] = j + 1;
//                break;
//            }
//
//            if (numbers.length-1 == j) {
//                i++;
//                j = i;
//            }
//            j++;
//        }
//        return ns;
//    }

//}
//    public int[] twoSum(int[] numbers, int target) {
//      int ns[]=new int[2];
//        outerloop:
//        for (int i = 0; i <numbers.length ; i++) {
//            for (int j = i; j <numbers.length ; j++) {
//                if (numbers[i]+numbers[j]==target&&i!=j){
//                    ns[0]=i+1;
//                    ns[1]=j+1;
//                    break outerloop;
//                }
//            }
//        }
//        return ns;
//    }}

//}