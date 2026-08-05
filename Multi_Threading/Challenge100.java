// 100. Write a program that starts a thread and prints its state after each significant event (creation, starting, and termination). Use Thread.sleep() to simulate long-running tasks and Thread.getState() to print the thread's state

package Multi_Threading;

public class Challenge100 {
    public static void main(String[] args) {
        ThreadState t = new ThreadState();
        System.out.println("Creating Thread");
        System.out.println(t.getState());

        t.start();
        System.out.println("Started Thread");
        System.out.println(t.getState());

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Handling Before Termination");
        }
        System.out.println("Thread Finished");
        System.out.println(t.getState());

    }
}
