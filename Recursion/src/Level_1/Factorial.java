package Level_1;

public class Factorial {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }

    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
