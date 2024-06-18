public class Maze {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int count = maze(1,1,row,col);
        System.out.println(count);
    }

    private static int maze(int startRow, int startCol, int endRow, int endCol) {
        if(startRow>endRow || startCol>endCol) return 0;
        if(startRow==endRow && startCol==endCol) return 1;
        int downWays = maze(startRow+1,startCol,endRow,endCol);
        int rightWays = maze(startRow,startCol+1,endRow,endCol);
        int totalways = downWays + rightWays;
        return totalways;
    }
}
