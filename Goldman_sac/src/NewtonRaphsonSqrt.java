public class NewtonRaphsonSqrt {
    public static double sqrt(double x, double epsilon) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative numbers");
        }
        if (x == 0 || x == 1) {
            return x;
        }

        double y = x; // Initial guess
        while (Math.abs(y * y - x) > epsilon) {
            y = (y + x / y) / 2;
        }
        return y;
    }

    public static void main(String[] args) {
        double number = 225;
        double epsilon = 1e-6; // Precision
        System.out.println("Square root of " + number + " is: " + sqrt(number, epsilon));
    }
}
