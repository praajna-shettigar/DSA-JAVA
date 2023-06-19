public class Pattern2 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void  pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
