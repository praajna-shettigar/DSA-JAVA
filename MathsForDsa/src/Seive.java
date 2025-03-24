
//check the prime numbers till N
public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean primes[] = new boolean[n+1];
        seive(n,primes);

    }
   //lets assume false in array means number is prime because initially it will be false
    static void seive(int n,boolean[] primes){
        for (int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j=j+i){
                    primes[j] = true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
