import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,3,4,1};

        System.out.println(findDuplicate(arr));
    }
    static List<Integer> findDuplicate(int[] arr){
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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){

                ans.add(arr[j]);
            }

        }
        return ans;
    }
}
