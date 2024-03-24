class Thread1 extends Thread{
    public void run() {
       for (int i=0;i<5;i++){
           System.out.println("Hi : "+ i);
           try {Thread.sleep(500);} catch (Exception e){}

       }
    }
}
class Thread2 extends Thread{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello : "+ i);
            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        Thread obj1 = new Thread1();
        Thread obj2 = new Thread2();
        obj1.start();
//        try {Thread.sleep(500);} catch (Exception e){}
        obj2.start();

    }
}
