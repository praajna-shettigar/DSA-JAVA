//check wheather the digit is even or odd
public class OddEven {
    public static void main(String[] args) {
        int n = 97;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) ==1; //bitwise and

    }
}
