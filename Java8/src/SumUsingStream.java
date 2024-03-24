import java.util.Arrays;

public class SumUsingStream {

    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1,6,8};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
