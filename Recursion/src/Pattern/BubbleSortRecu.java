package Pattern;
import java.util.Arrays;
public class BubbleSortRecu {
    public static void main(String[] args) {
        int[] arr = {4,1,5,3,6,8,9};
        buble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void buble(int[] arr,int n,int index){
        if(n == 0) {
            return;
        }
        if(index<n){
            if(arr[index]>arr[index+1]){
                int temp  = arr[index];
                arr[index] = arr[index+1];
                arr[index+1]= temp;
            }
            buble(arr,n,index+1);
        }else{
            buble(arr,n-1,0);

        }
    }
}
