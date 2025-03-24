import java.util.PriorityQueue;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }

        minHeap.poll(); // Remove the smallest element
        return minHeap.poll(); // Return the second smallest element
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 1, 3};
        System.out.println("Second Smallest: " + findSecondSmallest(arr)); // Output: 2
    }
}
