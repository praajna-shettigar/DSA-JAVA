import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuilt {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(3);
//        queue.add(5);
//        queue.add(6);
//        queue.add(10);
//
//        System.out.println(queue.remove());

        //Deque
        //Array Deque is a rezizeable array
        //It has no capacity restriction
        //it is faster than Linkedlist and stack
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(12);
        deque.addLast(43);
        System.out.println(deque.removeFirst());



    }
}
