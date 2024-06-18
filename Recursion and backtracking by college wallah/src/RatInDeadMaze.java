

// A maze is an N*N binary matrix of blocks where the upper left block is known as the Source block,
// and the lower rightmost block is known as the Destination block. If we consider the maze, then maze[0][0] is the source,
// and maze[N-1] [N-1] is the destination. Our main task is to reach the destination from the source. We have considered a rat as a character that can move either forward or downwards.
// In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can move only in the active blocks.
public class RatInDeadMaze {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int[][] maze = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};

        print(0,0,row-1,col-1,"",maze);
    }

    public static void print(int startRow,int startCol,int endRow,int endCol,String s,int[][] maze){
        if(startRow>endRow || startCol>endCol) return;
        if(startRow==endRow && startCol==endCol){
            System.out.println(s);
            return;
        }
        if(maze[startRow][startCol]==0) return;
        //go down
        print(startRow+1,startCol,endRow,endCol,s+"D",maze);

        //go right
        print(startRow,startCol+1,endRow,endCol,s+"R",maze);
    }

}
