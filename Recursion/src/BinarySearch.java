public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,8};
        System.out.println(search(arr,8,0,arr.length-1));
    }

    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(arr[m]== target){
            return m;
        }
        if(target<arr[m]){
            e = m-1;
        }else{
           s = m+1;
        }
        return search(arr,target,s,e);
    }
}
