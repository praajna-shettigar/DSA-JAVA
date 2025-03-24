import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String S1 = "A B C D";
        String S2 = "D B A C";

        if (areAnagrams(S1, S2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String S1, String S2) {
        // Remove spaces and convert to lowercase
        S1 = S1.replaceAll("\\s", "").toLowerCase();
        S2 = S2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (S1.length() != S2.length()) {
            return false;
        }

        // Count character frequencies for S1
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : S1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Subtract character frequencies using S2
        for (char c : S2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        // If map is empty, strings are anagrams
        return charCount.isEmpty();
    }
}
