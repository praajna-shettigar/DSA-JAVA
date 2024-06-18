public class MazePrintPath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        print(1,1,row,col,"");
    }

    public static void print(int startRow,int startCol,int endRow,int endCol,String s){
        if(startRow>endRow || startCol>endCol) return;
        if(startRow==endRow && startCol==endCol){
            System.out.println(s);
            return;
        }
        //go down
        print(startRow+1,startCol,endRow,endCol,s+"D");

        //go right
        print(startRow,startCol+1,endRow,endCol,s+"R");


    }
}
