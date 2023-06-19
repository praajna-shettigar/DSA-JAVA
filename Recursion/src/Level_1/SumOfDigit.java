package Level_1;

public class SumOfDigit {

    public static void main(String[] args) {
        int ans = sumofdigit(1342);
        System.out.println(ans);
    }

    static int sumofdigit(int n){
       if(n%10==n){
           return n;
       }
       return n%10 + sumofdigit(n/10);
    }
}

