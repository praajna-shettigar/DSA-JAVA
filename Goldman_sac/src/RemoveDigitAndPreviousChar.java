public class RemoveDigitAndPreviousChar {
    public static void main(String[] args) {
        String input = "a1b2c3ds4"; // Example input
        String result = removeDigitAndPrevious(input);
        System.out.println("Modified String: " + result);
    }

    public static String removeDigitAndPrevious(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If it's a digit, remove the last added character (if exists)
            if (Character.isDigit(ch)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1); // Remove previous character
                }
            } else {
                sb.append(ch); // Append non-digit characters
            }
        }
        return sb.toString();
    }
}
