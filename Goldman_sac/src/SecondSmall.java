public class SecondSmall {
    public static void main(String[] args) {
        int[] arr = {3,3,5, 8, 3};
        System.out.println("Second Smallest Element: " + findSecondSmallest(arr));
    }

    private static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=smallest){
                secondSmallest = smallest;
                smallest = arr[i];

            }if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest =arr[i];
            }
        }
        return  secondSmallest;
    }
}
