package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
//     triangle(4,0);
     triangle2(4,0);
    }

    public static void triangle(int row,int col){
        if (row == 0) return;
        if(col<row){
            triangle(row,col+1);
            System.out.print(" * ");
        }
        if(row==col){
            triangle(row-1,0);
            System.out.println();
        }

    }
    public static void triangle2(int row,int col){
        if (row == 0) return;
        if(col<row){
            System.out.print(" * ");
            triangle2(row,col+1);
        }
        if(row==col){
            System.out.println();
            triangle2(row-1,0);
        }

    }
}
