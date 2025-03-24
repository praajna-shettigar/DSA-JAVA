
//int array[] = {1,2,3,4}
//find the subarray of sum from the given array and give the no. of possibliites with the subarray sum is equal to the target value;
//Testcase :
//        1.Input : subArray(array,6) & output: 2
//        2.input : subArray(array,12) & output: -1

public class SubArraySum {
    public static int subArray(int[] arr, int target) {
        int count = 0;
        int left = 0, sum = 0;

        // Sliding Window Approach
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right]; // Expand window

            // Shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= arr[left++];
            }

            // If sum equals target, count the occurrence
            if (sum == target) {
                count++;
            }
        }

        return count == 0 ? -1 : count; // Return -1 if no subarray found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println("Output: " + subArray(array, 6));  // Output: 2
        System.out.println("Output: " + subArray(array, 12)); // Output: -1
    }
}
