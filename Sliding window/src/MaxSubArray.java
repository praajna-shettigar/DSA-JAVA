public class MaxSubArray {
    public static void main(String[] args) {
        int size = 7;
        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;
        int sum = maxSum(size,arr,k);
        System.out.println(sum);

    }

    public static int maxSum(int size, int[] arr, int k) {
        int i=0; //start of window
        int j=0; //end of window

        int sum = 0;
        int windowSum = 0;
        while (j<size){
            windowSum = windowSum +arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(windowSum>sum){
                    sum = windowSum;
                }
                windowSum = windowSum -arr[i];
                i++;
                j++;
            }

        }


        return sum;
    }
}
