//Find nth fibonacci number
public class Fibonacei {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base candition
        if(n<2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }
}
//this code doesn't work if value of n is 50 or more
//we can solve this using dynamic programing
