import java.util.Arrays;


//given a number from 0 - N with one missing number find that missing number
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 4};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correcIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correcIndex]) {
                int temp = arr[i];
                arr[i] = arr[correcIndex];
                arr[correcIndex] = temp;
            } else {
                i++;
            }

        }
        //return missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }

        }
        return arr.length;
    }
}