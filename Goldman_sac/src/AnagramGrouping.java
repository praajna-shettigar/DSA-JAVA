import java.util.*;

public class AnagramGrouping {
    public static Set<Set<String>> findAnagrams(List<String> words) {
        Map<String, Set<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);  // Sorting to create a common representation
            String sortedWord = new String(chars);

            anagramMap.putIfAbsent(sortedWord, new HashSet<>());
            anagramMap.get(sortedWord).add(word);
        }

        return new HashSet<>(anagramMap.values()); // Convert values to Set<Set<String>>
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "god", "cat");
        Set<Set<String>> result = findAnagrams(words);
        System.out.println(result); // Expected Output: [["cat"], ["dog", "god"]]
    }
}
