public class CanadaToNewYork {
    public static void main(String[] args) {
        int[][] grid = {
                {8, 0, 0, 1, 5} ,// 0 row New York
                {0, 2, 1, 1, 0},  // 1 row
                {2, 1, 1, 0, 0}  // r row  Canada
        };

        //13

        int m = grid.length;
        int n = grid[0].length;

        StringBuilder builder = new StringBuilder();

        System.out.println("Maximum stones collected: " + maxStonesRecursive(grid, m-1,0,""));
    }

    private static int maxStonesRecursive(int[][] grid, int i, int j,String str) {
        if(i==0 && j==grid[0].length-1){
            System.out.println(str);
            return grid[i][j];
        }
        if(i==0){

            return  grid[i][j] + maxStonesRecursive(grid,i,j+1,str+"L");
        }
        if(j==grid[0].length-1){

            return grid[i][j] + maxStonesRecursive(grid,i-1,j,str+"U");
        }
        return grid[i][j] + Math.max(
                maxStonesRecursive(grid, i - 1, j,str+"U"),  // Move up
                maxStonesRecursive(grid, i, j + 1,str+"L")   // Move right
        );
    }
}
