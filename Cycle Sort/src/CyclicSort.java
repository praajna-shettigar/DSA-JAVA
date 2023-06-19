import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correcIndex = arr[i]-1;
            if(arr[i] != arr[correcIndex]){
                int temp = arr[i];
                arr[i] = arr[correcIndex];
                arr[correcIndex]= temp;
            }else{
                i++;
            }
        }
    }
}
