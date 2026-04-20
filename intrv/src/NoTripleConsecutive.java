public class NoTripleConsecutive {
    private int[] arr;
    private int top;

    public NoTripleConsecutive(int size) {
        arr = new int[size];
        top = -1;
    }

    public void add(int num) {
        // Add element
        arr[++top] = num;

        // If last three are same, remove them
        if (top >= 2 && arr[top] == arr[top - 1] && arr[top - 1] == arr[top - 2]) {
            top = top - 3; // effectively remove last three
        }
//
    }

   public void printVa(){
       for (int i = 0; i <= top; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        int[] input = {2, 4, 6, 6, 7, 7, 6, 4, 8, 8, 8, 4};

        NoTripleConsecutive ds = new NoTripleConsecutive(input.length);
        for (int num : input) {
            ds.add(num);
        }
        ds.printVa();



//        System.out.println(ds.getRejectedCount());
    }
}
