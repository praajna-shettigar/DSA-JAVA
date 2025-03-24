//Find out the robot end position - implement a method walk(String path) where path is the set of command to move the Robot. move ROBOT in U,D,L,R direction. i.e Up,down,left,Right direction. implemented method should return the x and y co-ordinate of the robot as an integer array.
//Example:
//Scenario 1-
//input : ("UUU")
//output : new integer[0,3]
public class RobotPostion {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
//        String str = "UDLRURL";
        String str = "UUU";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='U'){
                y = y+1;
            }
            if(ch=='D'){
                y = y-1;
            }
            if(ch=='L'){
                x = x-1;
            }
            if(ch=='R'){
                x = x +1;
            }
        }
        System.out.println("x : " + x + " y : " + y);
    }
}
