import java.util.Arrays;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);
    }
}
