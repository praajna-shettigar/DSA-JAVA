
//convert the number into binary and take the base as 5 to sum up
public class MagicNumber {
    public static void main(String[] args) {
        int n = 3;

        int ans = 0;
        int base = 5;

        while(n>0){
            //find the last number
            int last = n&1;
            //leave the last and move the next
            n = n>>1;
            ans += base * last;
            base = base *5;
        }
        System.out.println(ans);

    }
}
