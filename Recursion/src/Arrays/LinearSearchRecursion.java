package Arrays;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,1,19,8};
        int target = 19;
        System.out.println(liner(arr,target,0));
    }
    static int liner(int[] arr,int target,int i){
        if(arr[i]==target){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return liner(arr,target,++i);

    }
}
