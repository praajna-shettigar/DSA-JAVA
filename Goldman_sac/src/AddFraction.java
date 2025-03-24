public class AddFraction {
    public static void main(String[] args) {
        int[] n1 = {3,9};
        int[] n2 = {2,7};

        int num = 0;
        int deno = 0;

        if(n1[1]==n2[1]){
            num = n1[0]+n2[0];
            deno = n1[1];
        }else{
            num = n1[0]*n2[1] + n1[1]*n2[0];
            deno = n1[1] * n2[1];
        }
        int temp = gcd(num,deno);
        int nu=  num /temp;
        int de = deno/temp;
        System.out.println(nu);
        System.out.println(de);
    }

    private static int gcd(int num, int deno) {
        if(num==0){
            return deno;
        }
        return gcd(deno%num,num);
    }
}
