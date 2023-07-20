package LeetCode.easy.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Date-7/20/2023
 * Time-12:21 AM
 */
public class Kids_With_the_Greatest_Number_of_Candies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggerOne = Integer.MIN_VALUE;
        List<Boolean> isKidWithKandy = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (biggerOne < candies[i]) biggerOne = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            isKidWithKandy.add(biggerOne <=(candies[i] + extraCandies));
        }
        return isKidWithKandy;
    }
}
