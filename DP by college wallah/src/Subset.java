import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int arr[] = {9,2,1,7};
        int target = 4;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(subset(0,arr,target,dp));
    }

    public static boolean subset(int i,int[] arr,int target,int[][] dp){
        if(i==arr.length){
            return target==0;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans = false;
        boolean skip = subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans =  skip;
        else{
            boolean pick = subset(i+1,arr,target-arr[i],dp);

            ans =  skip || pick;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;


    }
}
