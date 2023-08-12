package MergeSort;

import java.util.Arrays;




public class MergeSort {
    public static void main(String[] args) {
       int[] arr = {4,2,8,3,6,7};
       arr = mergeSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second){

        int[] arr= new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        //this loop will run untill one array reaches it's end
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                arr[k] = first[i];
                i++;
            }else{
                arr[k]=second[j];
                j++;
            }
            k++;
        }

        //to copy the remaining elements to the array
        while(i< first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return arr;


    }
}
