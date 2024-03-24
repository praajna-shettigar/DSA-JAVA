public class NumberSum {
    public static void main(String[] args) {
      int ans = numberSum(12345);
        System.out.println(ans);
    }

    public static int numberSum(int n){
        if(n<10) return n;
        return n %10 + numberSum(n/10);
    }
}
