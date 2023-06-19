public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9,14,16,18};
        int target = 3;
        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //might be possible that (start + end) exceeds range of int in java. so better way is to work with start + (end-start)/2
            if(target<arr[0]){
                return -1;
            }
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid -1;
            }else{
                //ans found
                return mid;
            }

        }
        //if target element is not present
        return end;

    }
}
