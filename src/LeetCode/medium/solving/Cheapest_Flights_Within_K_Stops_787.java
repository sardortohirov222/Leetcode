package LeetCode.medium.solving;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date-1/26/2023
 * Time-8:53 AM
 */
public class Cheapest_Flights_Within_K_Stops_787 {

    public static void main(String[] args) {
        var a = new Cheapest_Flights_Within_K_Stops_787();
        System.out.println(a.findCheapestPrice(4, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1));
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Integer[]> list = new ArrayList<>();
        int i=0;
        while (i == flights.length) {
            if (flights[i][0]==src){
                
            }
        }
        return 400;
    }

    public int priceFounder(ArrayList<Integer[]> flights) {
        int lowestPrice = 10000000;
        return 0;
    }
}
