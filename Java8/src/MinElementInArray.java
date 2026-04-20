import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);

        //second min
        int secMin = Arrays.stream(array).sorted().skip(1).findFirst().getAsInt();
        System.out.println(secMin);

        //second max
        int secMax = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secMax);
    }
}
