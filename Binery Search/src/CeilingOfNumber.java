
//Ceiling : Smallest number in the array which is greater or equal to target element
//int[] arr = {1,3,5,6,8,9,14,16,18}
// Ceiling(arr,target = 14 )  => ans 14
//Ceiling(arr,target = 15 )  => ans 16  because 15 is not present
public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9,14,16,18};
        int target = 4;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
            //might be possible that (start + end) exceeds range of int in java. so better way is to work with start + (end-start)/2
            if(target>arr[arr.length-1]){
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
        return arr[start];

    }

}


