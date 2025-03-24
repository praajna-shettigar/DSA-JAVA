public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrong(407));
    }

    public static boolean armstrong(int n){
        int sum = 0;
        int temp = n;
        while(n>0){
            int r = n%10;
            sum += r*r*r;
            n = n/10;
        }
        return sum == temp;
    }
}
