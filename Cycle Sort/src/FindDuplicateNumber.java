import java.util.Arrays;

//Array contain only one duplicate number.find that number
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,1};

        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr){
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
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans = arr[j];
            }
        }
        return ans;
    }
}
