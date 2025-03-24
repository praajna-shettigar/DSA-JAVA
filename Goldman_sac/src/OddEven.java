import java.util.Arrays;

//Given an array of integers.Rearrange the array such that all odd integers sould appear i
// n the left side of the array and all the even integers appear in the right side of the array.
// Contraint is you can't use another array
public class OddEven {
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer forward if the number is already odd
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            // Move right pointer backward if the number is already even
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            // Swap odd and even numbers if left < right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));


    }
}
