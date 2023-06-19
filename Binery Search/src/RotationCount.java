public class RotationCount {


     public static int countRoationArray(int[] arr){
         int pivot = findpivot(arr);
         if(pivot==-1){
             return 0;
         }else{
             return pivot+1;
         }
    }
    static int findpivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            //have to use 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(countRoationArray(arr));
    }

}
