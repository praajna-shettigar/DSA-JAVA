import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Filter even numbers and store in a new array
        int[] evenNumbers = Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .toArray();

        //print directly
        Arrays.stream(array).filter(num -> num % 2 == 0).forEach(x-> System.out.println("even - "+ x));
        // Print even numbers
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }
}
