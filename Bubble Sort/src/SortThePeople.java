import java.util.Arrays;

public class SortThePeople {

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        bubble(names,heights);
        System.out.println(Arrays.toString(names));

    }
    static void bubble(String[] names,int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i=0;i<arr.length;i++){
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]>arr[j-1]){
                    //swap
                    int temp = arr[j];
                    String tempname = names[j];
                    arr[j] = arr[j-1];
                    names[j]=names[j-1];
                    arr[j-1]=temp;
                    names[j-1]=tempname;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means array is sorted then break
            if(!swapped){
                break;
            }
        }
    }
}
