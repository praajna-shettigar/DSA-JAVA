public class Pattern4 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void  pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
