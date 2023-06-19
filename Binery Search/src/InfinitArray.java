public class InfinitArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 160;
        System.out.println(ans(arr,target));


    }

    static int ans(int[] arr,int target){
        //find the range
        //first start with the box of 2
        int start = 0;
        int end = 1;


        //condition for the target to lie in the range
        while (arr[end] < target){
            int temp = end+1;
//            end = end+(end-start+1)*2;
            end = end*2;
            start = temp;
        }
        return binerSearch(arr,target,start,end);

    }

    static int binerSearch (int[] arr,int target,int start,int end){

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
