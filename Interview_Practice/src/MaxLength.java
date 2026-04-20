public class MaxLength {


//    Find the length of the largest contiguous subarray with sum zero.
//
//    Sample input :
//                 0   1   2  3
//    int[] arr = {15, 4, -2, 2, -8, 1, 7, 10, 23};
//
//    Explaination :
//            -2, 2 ==> len 2
//            -8, 1, 7, ==> len 3
//            -2, 2, -8, 1, 7 ==> len 5
//    output: Max length is 5

    public static void main(String[] args) {
        int[] arr = {15, 4, -2,  -8, 1, 7, 10, 23};
        int maxlen = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum==0){
                    maxlen = Math.max(maxlen,j-i+1);
                }

            }
        }

        System.out.println(maxlen);
    }
}
