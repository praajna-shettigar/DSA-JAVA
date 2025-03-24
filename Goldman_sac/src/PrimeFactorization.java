import java.util.*;

public class PrimeFactorization {
    public static List<Integer> findPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        
        // Step 1: Handle 2 separately
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Step 2: Check odd numbers up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // Step 3: If n is still > 1, it is prime
        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int num = 18; // Example input
        System.out.println("Prime Factors: " + findPrimeFactors(num)); 
        // Output: Prime Factors: [2, 2, 2, 7]
    }
}
