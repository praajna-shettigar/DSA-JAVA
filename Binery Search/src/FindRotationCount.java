public class FindRotationCount {
    public static void main(String[] args) {
        int[] arr = {5,8,9,0,1,2,3,4};
        int pivot = findPivot(arr);
        System.out.println(pivot+1);
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
}
