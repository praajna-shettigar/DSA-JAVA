import java.util.Set;

class Thread3 implements Runnable {
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch (Exception e){}

        }
    }
}
class Thread4 implements Runnable{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}

public class ThreadUsingInterface {
    public static void main(String[] args) throws Exception {
        Runnable obj1 = new Thread3();
        Runnable obj2 = new Thread4();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {Thread.sleep(500);} catch (Exception e){}
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println("hellllllllo");
            }
        };
        Thread t3 = new Thread(obj);
        t3.start();

        //optimise above
        Thread t4 = new Thread(()-> System.out.println("hellllllllo from optimised code"));
        t4.start();

    }
}
