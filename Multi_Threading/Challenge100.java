// 100. Write a program that starts a thread and prints its state after each significant event (creation, starting, and termination). Use Thread.sleep() to simulate long-running tasks and Thread.getState() to print the thread's state

package Multi_Threading;

public class Challenge100 {
    public static void main(String[] args) {
        ThreadState t = new ThreadState();
        t.start();
        System.out.println("Creating Thread" + t.getState());

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Handling Before Termination");
        }
        System.out.println("Thread Finished" + t.getState());
    }
}
