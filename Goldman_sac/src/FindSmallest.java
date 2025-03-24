public class FindSmallest {
    public static void main(String[] args) {
        int[] arr= {2,2,4,10,23};

        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            //small = Math.min(small,arr[i]);
            if(arr[i]< small){
                secondsmall = small;
                small = arr[i];
            }
            if(arr[i]>small && arr[i]<secondsmall){
                secondsmall = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(secondsmall);
    }
}
