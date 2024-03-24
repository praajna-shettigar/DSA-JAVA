class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method inside the ThreadDemo class");
    }
}



public class RunnableLambdaExample {

    public static void main(String[] args) {
        //without using lambda expression
        Thread th = new Thread(new ThreadDemo());
        th.start();

        //using lambda expression
        Thread thread1 = new Thread(() -> {
            System.out.println("Runnable running using lambda expression");
        });
        thread1.start();

    }
}
