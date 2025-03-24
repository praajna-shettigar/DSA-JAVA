public class ReverseString {

    public static String reverse(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();
        
        // Initialize two pointers
        int left = 0, right = charArray.length - 1;
        
        // Swap characters from both ends until pointers cross
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move pointers towards each other
            left++;
            right--;
        }

        // Convert the character array back to string
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));  // Output: "olleh"
        System.out.println(reverse("world"));  // Output: "dlrow"
    }
}
