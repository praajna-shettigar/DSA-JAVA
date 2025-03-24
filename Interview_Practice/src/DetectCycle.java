public class DetectCycle {

    public static boolean detectCycle(int[] arr) {
        int slow = 0, fast = 0;

        while (true) {
            // Move slow pointer one step
            slow = arr[slow];

            // Move fast pointer two steps
            fast = arr[arr[fast]];

            // If slow and fast meet, a cycle is detected
            if (slow == fast) {
                return true;
            }

            // If fast pointer goes out of bounds, no cycle
            if (fast >= arr.length || arr[fast] >= arr.length) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1}; // Example input with a cycle
        int[] arr2 = {1, 2, 3, 5}; // Example input without a cycle

        System.out.println(detectCycle(arr1)); // Output: true
        System.out.println(detectCycle(arr2)); // Output: false
    }
}
