//find if the given number is powe of 10
public class PowerOf10 {

    public static boolean isPowerOfTen(int n) {
        // Handle the edge case where n is less than or equal to 0
        if (n <= 0) {
            return false;
        }

        // Keep dividing the number by 10 and check if we get 1
        while (n % 10 == 0) {
            n /= 10;
        }



        // If the number becomes 1, it was a power of 10
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTen(1000));  // Output: true
        System.out.println(isPowerOfTen(500));   // Output: false
        System.out.println(isPowerOfTen(10));    // Output: true
        System.out.println(isPowerOfTen(1));     // Output: true
        System.out.println(isPowerOfTen(0));     // Output: false
    }
}
