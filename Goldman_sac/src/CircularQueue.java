public class CircularQueue {
    private int[] deque;
    private int front,rear,size,capacity;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }


    //insert first
    public void insertFirst(int x){
        if ((front==0 && rear==deque.length-1) || (front==rear+1)) {
            System.out.println("Deque is full!");
        }
        else if (front==-1 && rear==-1) {
            front = rear = 0;
            deque[front] = x;
        }
        else if(front==0){
            front = deque.length-1;
            deque[front] = x;

        }else{
            front = front-1;
            deque[front] = x;
        }
        size++;
    }

    //insert last
    public  void insertLast(int x){
        if ((front==0 && rear==deque.length-1) || (front==rear+1)) {
            System.out.println("Deque is full!");
        }
        else if (front==-1 && rear==-1) {
            front = rear = 0;
            deque[front] = x;
        }
        else if(rear==deque.length-1){
            rear = 0;
            deque[rear] =x;
        }else {
            rear++;
            deque[rear] = x;
        }
        size++;
    }

    //remove first
    public void removeFirst(){
        if(rear==-1&& front==-1){
            throw new RuntimeException("Array is empty");
        } else if (front==rear) {
            front=rear =-1;
        } else if(front==size-1){
            front = 0;
        }else{
            front++;
        }
        size--;
    }

    //remove last
    public void removeLast(){
        if(rear==-1&& front==-1) {
            throw new RuntimeException("Array is empty");
        }else if (front==rear) {
            front=rear =-1;}
        else if(rear==0){
            rear = deque.length-1;
        }else {
            rear --;
        }
        size--;
    }

    public void printDeque() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }


    // Check if deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if deque is full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        //3,2,1,13,10
        queue.insertLast(13);
        queue.insertFirst(1);
        queue.insertFirst(2);
        queue.insertFirst(3);
        queue.insertLast(10);
        queue.printDeque(); //3,2,1,13,10
        queue.removeFirst();
        queue.printDeque(); // 2,1,13,10
        queue.removeLast();
        queue.printDeque(); //2,1,13
        queue.removeLast();
        queue.printDeque(); //2,1
    }
}
