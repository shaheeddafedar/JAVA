// 105. Write a program that uses an executor service to execute multiple Callable tasks. Each task should calculate and return thefactorial of a number provided to it. Use Future objects to receive the results of the calculations. After all tasks are submitted, retrieve the results from the futures, print them, and ensure the executor service is shut down correctly

package Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Challenge105 {
    public static void main(String[] args) throws Exception {
        ExecutorService execute = Executors.newFixedThreadPool(3);

        Thread105 t1 = new Thread105(3);
        Thread105 t2 = new Thread105(5);
        Thread105 t3 = new Thread105(7);

        Future<Integer> f1 = execute.submit(t1);
        Future<Integer> f2 = execute.submit(t2);
        Future<Integer> f3 = execute.submit(t3);
System.out.println("Factorial of 3 = " + f1.get());
        System.out.println("Factorial of 5 = " + f2.get());
        System.out.println("Factorial of 7 = " + f3.get());

     execute.shutdown();
    }
}

