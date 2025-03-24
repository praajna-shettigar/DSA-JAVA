import java.util.concurrent.*;

public class ThreadPoolExcutorExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),
                new CustomThredFacotry(),new CustomRejectHandler());

        for(int i=0;i<10;i++){
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                }catch (Exception e){

                }
                System.out.println("Task Processed "+ Thread.currentThread().getName());
            });
        }
    }
}

class CustomThredFacotry implements ThreadFactory  {

    @Override
    public Thread newThread(Runnable r) {
            Thread th = new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);
//            th.setName("Sample");
            return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected: " + r.toString());
    }
}
