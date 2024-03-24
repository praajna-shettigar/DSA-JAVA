import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2,2,1, 1, 4};

        List<Integer> res = disappearedNumber(arr);
        System.out.println(res);

    }

     public static List<Integer> disappearedNumber(int[] arr) {
        int i = 0;
    //    int[] res =
        while (i < arr.length) {
            int correcIndex = arr[i]-1;
            if (arr[i] != arr[correcIndex]) {
                int temp = arr[i];
                arr[i] = arr[correcIndex];
                arr[correcIndex] = temp;
            } else {
                i++;
            }

        }
         System.out.println(arr.toString());
        //return missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }

        }
        return ans;
    }
}
