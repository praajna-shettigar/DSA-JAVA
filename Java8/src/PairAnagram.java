import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairAnagram {
    public static void main(String[] args) {
        String[] arr= {"pan","tan","face","cafe","efac","ant"};
        List<String> list =Arrays.asList(arr);
        Map<List<String>,List<String>> map = list.stream().collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase()
                .split("")).sorted().collect(Collectors.toList())));
        System.out.println(map);

        list.stream()
                .collect(Collectors.groupingBy(word->{
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                })).entrySet().stream().map(c->c.getValue()).forEach(System.out::println);
    }
}
