//Qtn number 41
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,-1,1,4};

        System.out.println(FirstMissingPositive(arr));
    }

    static int FirstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
                int correcIndex = arr[i]-1;
                if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correcIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correcIndex];
                    arr[correcIndex] = temp;
                } else {
                    i++;
                }


        }
        //return missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }

        }
        return arr.length+1;
    }
}