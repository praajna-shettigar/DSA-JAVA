import java.util.HashSet;
import java.util.Set;


//given a string check if it is panagram or not
//A pangram is a sentence that contains every letter of the English alphabet at least once.
// For instance,
// "The quick brown fox jumps over the lazy dog" is a classic example of a pangram.
public class PangramChecker {
    public static void checkPangram(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case insensitivity
        Set<Character> letters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        if (letters.size() == 26) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is NOT a pangram.");
            System.out.print("Missing characters: ");
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (!letters.contains(ch)) {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isPangram(String str) {
        // Convert string to lowercase to handle case insensitivity
        str = str.toLowerCase();
        
        // Create a set to store unique alphabetic characters
        HashSet<Character> charSet = new HashSet<>();

        // Traverse the string and add alphabetic characters to the set
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                charSet.add(ch);
            }
        }

        // If the size of the set is 26, it's a pangram
        return charSet.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // Output: true
        System.out.println(isPangram("Hello World")); // Output: false
        System.out.println(isPangram("Pack my box with five dozen liquor jugs")); // Output: true
    }
}
