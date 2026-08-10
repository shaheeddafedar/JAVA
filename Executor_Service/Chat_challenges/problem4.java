package Executor_Service.Chat_challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class problem4 implements Runnable  {
    public void run(){
  System.out.println("name is +"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService excute = Executors.newFixedThreadPool(3);
        problem4 P1 = new problem4();
        problem4 P2 = new problem4();
        problem4 P3 = new problem4();
    excute.submit(P1);
    excute.submit(P2);
    excute.submit(P3);
    excute.shutdown();
    }
}
