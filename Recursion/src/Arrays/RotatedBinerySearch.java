package Arrays;

public class RotatedBinerySearch {
    public static void main(String[] args) {
        int[] arr ={6,7,8,9,10,1,2,3};
        int ans = search(arr,0,arr.length-1,10);
        System.out.println(ans);
    }
    public static int search(int[] arr,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search(arr,s,m-1,target);
            }else {
                return search(arr,m+1,e,target);
            }
        }else{
            if(target>=arr[m] && target<=arr[e]){
                return search(arr,m+1,e,target);
            }else{
                return search(arr,s,m-1,target);
            }
        }

    }
}
