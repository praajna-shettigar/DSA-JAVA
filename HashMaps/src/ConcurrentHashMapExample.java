import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> stockMap = new ConcurrentHashMap<>();

        // Add some initial items in the stock
        stockMap.put("Laptop", 10);
        stockMap.put("Mobile", 15);
        stockMap.put("Tablet", 5);

        // Create threads that modify the stock concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                // Increase the stock for Laptop
                stockMap.put("Laptop", stockMap.getOrDefault("Laptop", 0) + 1);
                System.out.println("Thread 1 - Added 1 Laptop. Current stock: " + stockMap.get("Laptop"));
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                // Decrease the stock for Mobile
                stockMap.put("Mobile", stockMap.getOrDefault("Mobile", 0) - 1);
                System.out.println("Thread 2 - Removed 1 Mobile. Current stock: " + stockMap.get("Mobile"));
                try { Thread.sleep(120); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final stock status
        System.out.println("Final stock status: " + stockMap);
    }
}
