import java.util.Arrays;



public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,8,3,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr){
      //find the max item in the array and swap with correct index
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
     static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
