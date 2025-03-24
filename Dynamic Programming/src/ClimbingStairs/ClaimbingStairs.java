package ClimbingStairs;
//problem statement : Given a number of stairs. Starting from the 0th stair we need to climb to the “Nth” stair.
// At a time we can climb either one or two steps. We need to
//return the total number of distinct ways to reach from 0th to Nth stair.

public class ClaimbingStairs {
    public static void main(String[] args) {
        int n = 7;
        int prev2 = 0; //number of ways to reach the 0'th step
        int prev = 1;  //number of ways to reach the 1'st step

        for (int i = 1; i <= n; i++) {
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev = cur_i;
        }

        System.out.println(prev);
    }
}
