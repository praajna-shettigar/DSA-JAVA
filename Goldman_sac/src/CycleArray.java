
//check wheather cycle is present in the array or not
public class CycleArray {

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,1};
//        int[] arr = {1,2};
        System.out.println(cycle(arr));

    }

    public static boolean cycle(int[] arr){
        int slow = 0;
        int fast = 0;

        while (true){
            slow = arr[slow];
            fast = arr[arr[fast]];

            if(fast<0 || fast>=arr.length){
                return false;
            }
            if(fast==slow) return true;
        }
    }
}
