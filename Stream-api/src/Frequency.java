import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Q. Given a list of strings, find the frequency of each word using Java streams:
public class Frequency {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        wordFrequency.forEach((a,b)-> System.out.println("key: "+a + " value : " +b));

        // Sorting the map by values in descending order
        Map<String, Long> sortedMap = wordFrequency.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Merge function, not needed here
                        LinkedHashMap::new // Maintains insertion order
                ));

        // Print sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
