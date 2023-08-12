package Level_1;

public class PowerOfFour {
    public static void main(String[] args) {
        boolean ans = isPowerOfFour(5);
        System.out.println(ans);
    }
    static boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4 != 0 || n<=0) return false;
        return isPowerOfFour(n/4);
    }
}
