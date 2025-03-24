public class SumOfString {
    public static void main(String[] args) {
        System.out.println(sumOfStr(325));
    }
    public static int sumOfStr(int num){
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum +rem;
            num = num / 10;
        }
        if(sum>9){
           return sumOfStr(sum);
        }
        return sum;
    }
}
