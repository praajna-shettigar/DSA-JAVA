public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(4);
        CircularQueue queue = new CircularQueue(4);

        queue.insert(1);
        queue.insert(4);
        queue.insert(5);
        queue.insert(7);
//        queue.insert(9);

        queue.display();
        System.out.println(queue.remove());
        queue.display();


    }
}
