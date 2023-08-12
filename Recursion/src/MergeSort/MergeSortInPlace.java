package MergeSort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {2,4,12,45,14,8,7,3,5,8};
        mergeSortInPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s == 1){
            return ;
        }
        int mid = (s + e)/2;
        mergeSortInPlace(arr,0,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr,int s,int m,int e){
        int[] mix= new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        //this loop will run untill one array reaches it's end
        while(i<m&& j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        //to copy the remaining elements to the array
        while(i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l< mix.length;i++){
            arr[s+l] = mix[l];
        }

    }

}
