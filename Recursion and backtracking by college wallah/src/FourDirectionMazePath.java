public class FourDirectionMazePath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[row][col]; //by default every cell is filled with false
        print(0,0,row-1,col-1,"",isVisited);
    }

    public static void print(int startRow,int startCol,int endRow,int endCol,String s,boolean[][] isVisited){
        if(startRow<0 || startCol<0) return;
        if(startRow>endRow || startCol>endCol) return;
        if(isVisited[startRow][startCol]==true) return;

        if(startRow==endRow && startCol==endCol){
            System.out.println(s);
            return;
        }
        isVisited[startRow][startCol] = true;
        //go down
        print(startRow+1,startCol,endRow,endCol,s+"D",isVisited);

        //go right
        print(startRow,startCol+1,endRow,endCol,s+"R",isVisited);

        //go left
        print(startRow,startCol-1,endRow,endCol,s+"L",isVisited);

        //go up
        print(startRow-1,startCol,endRow,endCol,s+"U",isVisited);

        //backtracking
        isVisited[startRow][startCol] = false;
    }
}
