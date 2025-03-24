public class SecondSmallestInSortedRoatated {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,-1,0,1,2,3,4};
        int num = findPivot(arr);
        int min = arr[(num+1)%arr.length];
        int min2 = arr[(num+2)%arr.length];
        int max = num;
        System.out.println(min);
        System.out.println(min2);
        System.out.println(max);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start<=end){
            int mid = start + (end-start)/2;

            //4 cases
            if(mid < end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
