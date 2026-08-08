package Executor_Service;

public class Thread104 implements Runnable {

    int time = (int) (Math.random() * 5) + 1;

    Thread name = Thread.currentThread();

    public void run() {
        System.out.println(" Thread Started : " + name.getName());
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            System.out.println("Exception during sleep " + e);
        }
        System.out.println(" Thread Ended : " + name.getName());

    }
}
