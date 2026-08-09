// 103. Write a program that creates a single-threaded executor service. Define and submit a simple Runnable task that prints numbers from 1 to 10. After submission, shut down the executor.
package Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread();
        ExecutorService execute = Executors.newSingleThreadExecutor();
        execute.submit(n1);
        execute.shutdown();
    }
}
