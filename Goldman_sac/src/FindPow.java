public class FindPow {
    public static void main(String[] args) {
        findPower(2,8);
        findPower(15,0);
        findPower(5,-2);
    }
    public static void findPower(int base,int exp){

        double res = 1;
        for(int i=1;i<=Math.abs(exp);i++){
            res = res *base;
        }
        if(exp<0){
            res = 1/res;
        }
        System.out.println(res);

    }
}
