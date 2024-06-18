public class RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int[][] maze = {{1,1,0,1,1,1},
                {0,1,1,0,1,1},
                {1,0,1,1,1,1},
                {0,1,0,1,0,1}};
        boolean[][] isVisited  =new boolean[row][col];
        print(0,0,row-1,col-1,"",maze,isVisited);
    }
    public static void print(int startRow,int startCol,int endRow,int endCol,String s,int[][] maze,boolean[][] isVisited){
        if(startRow<0||startCol<0) return;
        if(startRow>endRow || startCol>endCol) return;
        if(startRow==endRow && startCol==endCol){
            System.out.println(s);
            return;
        }
        if(maze[startRow][startCol]==0) return;
        if(isVisited[startRow][startCol]==true) return;

        isVisited[startRow][startCol] = true;

        //go down
        print(startRow+1,startCol,endRow,endCol,s+"D",maze,isVisited);

        //go right
        print(startRow,startCol+1,endRow,endCol,s+"R",maze,isVisited);

        //go left
        print(startRow,startCol-1,endRow,endCol,s+"L",maze,isVisited);

        //go up
        print(startRow-1,startCol,endRow,endCol,s+"U",maze,isVisited);

        //backtracking
        isVisited[startRow][startCol] = false;
    }
}
