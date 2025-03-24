import java.util.HashMap;

//Given an array of length n and a target, return a pair(indices) whose sum is equal to the target,
// If there is no pair present,return -1
public class TwoSum {

    public static void main(String[] args) {
          int[] res = twoSum(new int[]{2, 4, 6,3, 2, 1},9);
        System.out.println(res[0]+ " "+ res[1]);
    }

    public static int[] twoSum(int[] nums,int target){
        int n= nums.length;
        int[] ans = {-1,-1};
        //value,index
        HashMap<Integer,Integer> mp = new HashMap<>();

        for (int i=0;i<nums.length;i++){
              int partner = target-nums[i];
              if(mp.containsKey(partner)){
                  ans[0] = i;
                  ans[1] = mp.get(partner);
                  return ans;
              }
              mp.put(nums[i],i);
        }

        return ans;
    }
}
