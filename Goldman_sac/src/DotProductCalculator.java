import java.util.Scanner;

//Find the dot product of two arrays along with exception handling in case of wrong inputs
public class DotProductCalculator {
    public static int dotProduct(int[] a, int[] b)  {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }
        if (a.length == 0 || b.length == 0) {
            throw new IllegalArgumentException("Arrays cannot be empty.");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int dotProduct = 0;
        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];
        }
        return dotProduct;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        try {
            // Input first array
            System.out.print("Enter the size of arrays: ");
            int size = scanner.nextInt();

            int[] a = new int[size];
            int[] b = new int[size];

            System.out.println("Enter elements for first array:");
            for (int i = 0; i < size; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println("Enter elements for second array:");
            for (int i = 0; i < size; i++) {
                b[i] = scanner.nextInt();
            }
//            b =null;

            // Compute dot product
            int result = dotProduct(a, b);
            System.out.println("Dot Product: " + result);

//        } catch (IllegalArgumentException e) {
//            System.err.println("Error: " + e.getMessage());
//        } catch (Exception e) {
//            System.err.println("Unexpected error: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
    }
}
