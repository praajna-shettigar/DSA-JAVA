import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q. Find the longest string in a list of strings using Java streams:
public class LongestString {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "daaaaaaaaaaaaaaate", "grapefruit"};
        Arrays.stream(strings).max(Comparator.comparingInt(s->s.length())).ifPresent(s -> System.out.println(s));

    }
}
