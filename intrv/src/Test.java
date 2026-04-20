public class Test {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int i = 0;

        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        for(int k=0;k<i+1;k++){
            System.out.print(nums[k] + " ");
        }
    }
}
