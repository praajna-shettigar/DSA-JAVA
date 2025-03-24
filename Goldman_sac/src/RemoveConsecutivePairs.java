import java.util.Stack;

//Remove the consective character pairs repetitively
//input : saabbs
//out : sabs
public class RemoveConsecutivePairs {
    public static String removePairs(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If stack is not empty and top element matches current character, pop it
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            }
                stack.push(ch);

        }

        // Build final string from stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removePairs("saabbs"));  // Output: "sabs"
        System.out.println(removePairs("aabbcc"));  // Output: ""
        System.out.println(removePairs("abbacddc")); // Output: ""
        System.out.println(removePairs("azxxzy"));  // Output: "ay"
    }
}
