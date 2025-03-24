package ClimbingStairs;

public class ClaimbingStairsUsingRecursion {

    public static int stairs(int n){
        if(n<=1) return 1;

        return stairs(n-1)+stairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(stairs(7));
    }
}
