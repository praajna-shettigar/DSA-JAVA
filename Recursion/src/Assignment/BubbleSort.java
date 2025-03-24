package Assignment;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[],int row,int col){
          if(col==0){
              return;
          }

          for(int i=0;i<col;i++){
              if(arr[i]>arr[i+1]){
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
          }
          bubbleSort(arr,0,col-1);

    }
}
