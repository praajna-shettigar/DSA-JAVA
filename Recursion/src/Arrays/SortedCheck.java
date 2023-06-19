package Arrays;

public class SortedCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,9,12};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int n){
        if(n == arr.length-1){
            return true;
        }
        return arr[n]<=arr[n+1] && sorted(arr,n+1);

    }
}
