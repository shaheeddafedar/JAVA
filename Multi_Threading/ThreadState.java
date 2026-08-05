package Multi_Threading;

public class ThreadState extends Thread {

    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("Thread Running from inide " + getState());

        } catch (InterruptedException e) {
            System.out.println("Thread Causing from Inside");
        }
    }
}
