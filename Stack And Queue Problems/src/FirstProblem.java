import java.util.Stack;

//232.implement Queue using stack
public class FirstProblem {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        System.out.println(stack.pop());
    }

}

class QueueUsingClass{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingClass(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removedValue = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removedValue;

    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }


}
