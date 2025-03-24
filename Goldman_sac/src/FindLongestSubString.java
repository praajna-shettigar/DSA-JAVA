import java.util.Stack;

public class FindLongestSubString {
    public static String findLongestUniformSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int maxLength = 1, currentLength = 1;
        int maxStartIndex = 0, currentStartIndex = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++; // Increase count for the same character
            } else {
                currentLength = 1; // Reset count
                currentStartIndex = i;
            }

            // Update maxLength and start index if needed
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStartIndex = currentStartIndex;
            }
        }
        return s.substring(maxStartIndex, maxStartIndex + maxLength);
    }


    public static void main(String[] args) {
        String input = "abcd";
        System.out.println("Longest Uniform Substring: " + findLongestUniformSubstring(input));
        // Output: "aaaa"
    }
}
