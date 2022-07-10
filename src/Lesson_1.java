public class Lesson_1 {
    // Using this mask we can remove the signed bit 1 to 0
    static int mask = (int)0x7FFFFFFF;


    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {



        int setBits=0;

        // Checking if the number is negative which means it has some hack lot of 1's
        // So we'll make the signed bit 1 to 0 to make it positive and as we have removed the
        // last bit by masking it than we'll add one to setBits and rest work will be done by
        // method below

        if(n<0){
            n = mask&n;
            setBits++;
            // We've removed the signed bit at last and added one to setbits as we have to count that as well
        }

        while(n>0){
            if((n&1)!=0){
                setBits++;
            }
            n>>=1;
        }
        return setBits;
    }


}
