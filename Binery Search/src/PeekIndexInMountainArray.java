public class PeekIndexInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,11,5,2};
        System.out.println(peekIndexMountainArray(arr));
    }
    public static int peekIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<end){
            int mid =start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of the array
                //this may be the ans,but look at left
                //
                end = mid;
            }else {
                //you arr in asc part of the array
                start = mid +1;
            }

        }
        //in the end start == end and pointing to the largest number beacuse of the above two checks
        return arr[start];
    }
}
