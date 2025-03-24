package HouseRobber;

//leetcode : 198 - https://leetcode.com/problems/house-robber

public class HouseRobberRecusion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(f(nums,nums.length-1));
    }

    public static int f(int[] nums,int n){
        if(n==0){
            return nums[0];
        }
        if(n<0) return 0;

        int pick = nums[n] + f(nums,n-2);
        int nonPick = 0 + f(nums,n-1);

        return Math.max(pick,nonPick);
    }
}
