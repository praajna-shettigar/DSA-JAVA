public class fibo {
    public static void main(String[] args) {
        int a =0;
        int b= 1;
        while(a<10){
            System.out.println(a);
            int val = a;
            a = b;
            b = val+b;
        }
    }
}
