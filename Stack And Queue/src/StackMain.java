public class StackMain {
    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(5);


//        System.out.println(stack.pop());
//        System.out.println(stack.peek());

        DynamicStack stack1 = new DynamicStack(4);
        stack1.push(1);
        stack1.push(2);
        stack1.push(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(5);

        System.out.println(stack1.peek());
        System.out.println(stack1.peek());
        System.out.println(stack1.peek());
        System.out.println(stack1.peek());
        System.out.println(stack1.peek());
        System.out.println(stack1.peek());





    }
}
