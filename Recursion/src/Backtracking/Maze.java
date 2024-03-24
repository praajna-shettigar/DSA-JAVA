package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        path("",3,3);
//        System.out.println(count(3,3));
//        System.out.println(pathArray("",3,3));
//        System.out.println(pathArrayDiagonal("",3,3));
          boolean[][] maze = {
                  {true,true,true},
                  {true,false,true},
                  {true,true,true}
          };
        pathObstacles("",maze,0,0);
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
//        int left = count(r-1,c);
//        int right = count(r,c-1);
//        return left+right
        return count(r-1,c) + count(r,c-1);
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathArray(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathArray(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(pathArray(p+'R',r,c-1));
        }
        return ans;
    }

    static ArrayList<String> pathArrayDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1){
            ans.addAll(pathArrayDiagonal(p+'D',r-1,c-1));
        }
        if(r>1){
            ans.addAll(pathArrayDiagonal(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll(pathArrayDiagonal(p+'H',r,c-1));
        }
        return ans;
    }

    //maze with obstacles
    static void pathObstacles(String p,boolean[][] maze ,int r,int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathObstacles(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathObstacles(p+'R',maze,r,c+1);
        }
    }
}
