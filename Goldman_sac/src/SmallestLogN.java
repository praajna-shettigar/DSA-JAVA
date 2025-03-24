import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestLogN {
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Insert all elements into the heap (O(n))
            for (int num : arr) {
            minHeap.add(num);
        }

        // Extract the smallest element (O(log n))
            return minHeap.poll();
}

public static void main(String[] args) {
    int[] arr = {12, 3, 5, 7, 19, 1, 8}; // Unsorted array
    System.out.println("Smallest Number: " + findSmallest(arr)); // Output: 1
}

}
