public class SpiralSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 14, 20, 18, 12, 5 };
        System.out.println(isSpirallySorted(arr));  // Output: true

        int[] arr2 = {1, 6, 3, 7, 2, 5, 4};
        System.out.println(isSpirallySorted(arr2)); //false
    }

    private static boolean isSpirallySorted(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            if(arr[start]>arr[end]) {
                return false;
            }
            start++;
            if(arr[end] > arr[start]){
                return false;
            }
            end--;
        }
        return true;

    }
}
