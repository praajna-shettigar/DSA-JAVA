import java.time.LocalTime;
import java.util.Arrays;

public class UnBoundedKnapSack {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        int[] val = {6,3,7,25};
        int[] wt = {2,2,8,9};
        int c = 9;
        int n = wt.length;
        int[][] dp = new int[n][c+1];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(profit(0,wt,val,c,dp));
        LocalTime endTime = LocalTime.now();

    }

    public static int profit(int i,int[] wt, int[] val, int c,int[][] dp){

        if(i== wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip = profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c] = skip;
        int pick = val[i]+ profit(i,wt,val,c-wt[i],dp);
        return dp[i][c] = Math.max(pick,skip);

    }
}
