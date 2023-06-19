public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        System.out.println(search(arr,5));
    }

    static int search(int[] nums,int target){
        int pivot = findPivot(nums);

        if(pivot==-1){
            return binerSearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>nums[0]){
            return binerSearch(nums,target,0,pivot-1);
        }else{
            return binerSearch(nums,target,pivot+1,nums.length-1);
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

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

    static int binerSearch (int[] arr,int target,int start,int end){
//        int start =0;
//        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //might be possible that (start + end) exceeds range of int in java. so better way is to work with start + (end-start)/2
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
        return -1;
    }
}
