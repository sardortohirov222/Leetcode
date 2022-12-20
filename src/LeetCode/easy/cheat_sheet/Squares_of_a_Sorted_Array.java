package LeetCode.easy.cheat_sheet;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Squares_of_a_Sorted_Array ofASortedArray=new Squares_of_a_Sorted_Array();
        for (int a:ofASortedArray.sortedSquares(new int[]{-8,-4,1,4,5,7,8,9})
             ) {
            System.out.print(a+" ");
        }
    }

    public int[] sortedSquares(int[] nums) {
      int sorted[]=new int[nums.length];
      int smallest=0;
      int bigest=nums.length-1,jig=nums.length-1;
      while (smallest<=bigest){
        int lit_pow=nums[smallest]*nums[smallest];
        int big_pow=nums[bigest]*nums[bigest];
        if (lit_pow>big_pow){
            sorted[jig]=lit_pow;
            smallest++;
        }else {
            sorted[jig]=big_pow;
            bigest--;
        }
        jig--;
      }

        return sorted;
    }

    }



//    public int[] sortedSquares(int[] nums) {
//        int[] sorted=new int[nums.length];
//        for (int i = 0; i <nums.length ; i++) {
//            sorted[i]=nums[i]*nums[i];
//        }
//        for (int i = 0; i < sorted.length; i++) {
//            for (int j = 0; j < sorted.length; j++) {
//                if (sorted[i] < sorted[j]) {
//                    int temp = sorted[i];
//                    sorted[i] = sorted[j];
//                    sorted[j] = temp;
//                }
//            }
//        }
//        return sorted;
//    }



//    public int[] sortedSquares(int[] nums) {
//        int[] sorted=new int[nums.length];
//        for (int i = 0; i <nums.length ; i++) {
//            sorted[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(sorted);
//        return sorted;
//    }

//}
