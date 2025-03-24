public class JumpingOnCloud {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,0,0};
        //System.out.println(jump(arr));
        System.out.println(minJump(arr));
    }

    public static int minJump(int[] arr){
        int jump = 0;
        int index = 0;

        while(index<arr.length-1) {
            if (index + 2 < arr.length && arr[index + 2] == 0) {
                index += 2; // Prefer a double jump
            } else if (index + 1 < arr.length && arr[index + 1] == 0) {
                index += 1; // Single jump if needed
            } else {
                return -1; // If neither step is possible, return -1 (stuck)
            }
            jump++;
        }
        return jump;
    }

    public static int jump(int[] arr) {
        int jump = 0;
        int c= 0;
        int index = 0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==1 && arr[i+1]==1){
                c = -1;
            }
            if(c==-1){
                System.out.println("since two jumps are thunderheads");
                return jump;
            }else{
                while(index<arr.length){
                    if(index==arr.length-1) break;
                    if(index==arr.length-2){
                        jump++;
                        break;
                    }else if(index+2<arr.length && arr[index+2]!=1){
                        index += 2;
                        jump++;
                    }else{
                        index += 1;
                        jump++;
                    }
                }
            }
        }
        return  jump;
    }
}
