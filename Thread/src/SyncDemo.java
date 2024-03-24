class Counter {
    int count;
    public synchronized void increament() {
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception{

        Counter c = new Counter();
        Thread t1 = new Thread( () -> {
                for (int i=1;i<=1000;i++){
                    c.increament();
                }
            });


//        t1.join();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i=1;i<=1000;i++){
                    c.increament();
                }
            }
        });
        t2.start();
        t1.start();


        try {Thread.sleep(500);} catch (Exception e){}

        System.out.println("count : " + c.count);
    }
}

