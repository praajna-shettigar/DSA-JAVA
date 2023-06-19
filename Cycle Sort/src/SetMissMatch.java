import java.util.Arrays;

public class SetMissMatch {
    public static void main(String[] args) {
        int[] arr = {1,1};

        int[] res = setMisMatch(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] setMisMatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correcIndex = arr[i] - 1;
            if (arr[i] != arr[correcIndex]) {
                int temp = arr[i];
                arr[i] = arr[correcIndex];
                arr[correcIndex] = temp;
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                   ans[0] = arr[j];
                   ans[1] =j+1 ;
            }
        }
        return ans;
    }
}