import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//find the second highest number from the given array
public class SecondHigh {
    public static void main(String[] args) {
        int[] numbers = {2,5,1,7,4,8,9};

        //boxed() will make the auto boxing
        //you cannot perform Comparator.reverseOrder() in the integer array
        List<Integer> integerList = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList.get(1));
    }
}
