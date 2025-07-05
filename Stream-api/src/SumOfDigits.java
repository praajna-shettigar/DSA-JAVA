import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {
    public static void main(String[] args)
    {
        int i = 15623;

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).mapToInt(s->Integer.parseInt(s)).sum();

        System.out.println(sumOfDigits);

        String str = "123456";
        Integer prod = Stream.of(str.split("")).mapToInt(s->Integer.parseInt(s)).reduce((a,b)->a*b).getAsInt();
        System.out.println(prod);
    }
}
