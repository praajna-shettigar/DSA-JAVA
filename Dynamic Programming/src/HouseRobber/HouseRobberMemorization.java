package HouseRobber;

import java.util.Arrays;

public class HouseRobberMemorization {
    public static void main(String[] args) {
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(f(nums,nums.length-1,dp));
    }
    public static int f(int[] nums,int n,int[] dp){
        if(n==0){
            return nums[0];
        }
        if(n<0) return 0;

        if(dp[n]!=-1) return dp[n];

        int pick = nums[n] + f(nums,n-2,dp);

        int nonPick = 0 + f(nums,n-1,dp);

        return dp[n] = Math.max(pick,nonPick);
    }
}
