// 104. Create a fixed thread pool with a specified number of threads using Executors.newFixedThreadPool(int). Submit multiple tasks 
// to this executor, where each task should print the current thread's name and sleep for a random time between 1 and 5 seconds. 
// Finally, shut down the executor and handle proper termination using awaitTermination.

package Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Challeneg104 {
    public static void main(String[] args) {

        ExecutorService execute = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            Thread104 t1 = new Thread104();
            execute.submit(t1);
        }
        execute.shutdown();
        try {
            if (!execute.awaitTermination(20, TimeUnit.SECONDS)) {
                execute.shutdownNow();
                System.out.println("Forecfully Shutdown");

            }
        } catch (Exception e) {
            System.out.println("Exception during Shutdown " + e);
        }
    }
}
