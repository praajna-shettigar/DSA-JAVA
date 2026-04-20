import java.util.Arrays;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pairDp(n,dp));
        System.out.println(pairTabulation(n));
    }

    //recursion
    private static int pair(int n) {
        if(n<=2) return n;
        return pair(n-1) + (n-1)*pair(n-2);
    }

    //dp - memorization
    public static int pairDp(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n] !=-1) return dp[n];
        return dp[n] = pairDp(n-1,dp) + (n-1)*pairDp(n-2,dp);
    }

    //dp - tabulation
    private static int pairTabulation(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        if(n>1) dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }


}
