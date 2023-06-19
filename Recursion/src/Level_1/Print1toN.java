package Level_1;

public class Print1toN {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
//        to print from n to 1
//        System.out.println(n);
        fun(n-1);
//        to print from 1 to n
        System.out.println(n);
    }
}
