public class PascalsTriangle {
//    public static void printPascalsTriangle(int numRows) {
//        for (int i = 0; i < numRows; i++) {
//            int num = 1; // First value in a row is always 1
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + " ");
//                num = num * (i - j) / (j + 1); // Compute next value
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int numRows = 6;
        printPascalsTriangle(numRows);
    }

    private static void printPascalsTriangle(int numRows) {
        int[][] pasc = new int[numRows][numRows];

        for (int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    pasc[i][j] = 1;
                    System.out.print(pasc[i][j]);
                }else{
                    pasc[i][j] = pasc[i-1][j-1] + pasc[i-1][j];
                    System.out.print(pasc[i][j]);
                }
            }
            System.out.println();
        }
    }
}
