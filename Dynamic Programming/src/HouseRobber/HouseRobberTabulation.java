package HouseRobber;

import java.util.Arrays;

public class HouseRobberTabulation {
    public static void main(String[] args) {
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(f(nums));

    }

    public static int f(int[] nums){
        int[] dp = new int[nums.length];

        Arrays.fill(dp,-1);
        dp[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            int pick = nums[i];
            if(i>1){
                pick += dp[i-2];
            }
            int nonPick = dp[i-1];
            dp[i] =Math.max(pick,nonPick);

        }

        return dp[dp.length-1];

    }
}
