// 104. Create a fixed thread pool with a specified number of threads using Executors.newFixedThreadPool(int). Submit multiple tasks 
// to this executor, where each task should print the current thread's name and sleep for a random time between 1 and 5 seconds. 
// Finally, shut down the executor and handle proper termination using awaitTermination.


package Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Challeneg104 {
    public static void main(String[] args) {
        Thread104 t1 = new Thread104("shah");
        Thread104 t2 = new Thread104("sal");
        Thread104 t3 = new Thread104("sab");

        ExecutorService execute  =  Executors.newFixedThreadPool(3);
     execute.submit(t1);
     execute.submit(t2);
     execute.submit(t3);
     execute.shutdown();

     if (!execute.awaitTermination(5, TimeUnit.SECONDS)) {
        execute.shutdown();
     }
    }
}
