public class NthFibo {
    public static void main(String[] args) {
        int n = 6;
        int first = 0;
        int second = 1;
        int nth = second;
        for (int i = 3; i <=n ; i++) {
             nth = first +second;
            first =second;
            second = nth;
        }
        System.out.println(nth);

    }
}
