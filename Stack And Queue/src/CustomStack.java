public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public  CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Nothing is there to remove");
        }
        int remvoe = data[ptr];
        ptr--;
        return remvoe;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");

        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length -1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }

}
