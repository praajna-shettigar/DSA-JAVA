public class    BinerySearch {
    public static void main(String[] args) {
         int[] arr = {2,5,6,8,9,13,18,46,65,86};
          int target = 13;
        System.out.println(binerSearch(arr,target));

    }

    //return the index
    //return -1 if it does not exist
    static int binerSearch (int[] arr,int target){
        int start =0;
        int end = arr.length-1;
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
