public class OrderAgnosticBinerySearch {
    public static void main(String[] args) {
         int[] arr = {2,3,5,7,9,18,24,79,97};
         int target = 24;
         int[] arr1 = {97,79,24,18,9,7,5,3,2};
        System.out.println(orderAgnostic(arr1,target));
    }
    static int orderAgnostic(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        //Find whether array is sorted in ascending order or descending order
        boolean isAscending = arr[end]>arr[start];
        while(start<=end){
            //find the middle element
            //might be possible that (start + end) exceeds range of int in java. so better way is to work with start + (end-start)/2
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target>arr[mid]){
                start = mid+1;
                }
                else{
                end = mid -1;
            }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        //if target element is not present
        return -1;
    }
}
