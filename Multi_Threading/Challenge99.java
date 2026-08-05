// 99 Write a program that creates two threads. Each thread should print  "Hello from Thread X", where X is the number of the thread (1 or 2),  ten times, then terminate.

package Multi_Threading;

public class Challenge99 extends Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(1);
        Thread2 t2 = new Thread2(2);

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println(" Execption during Thread 1 ");
        }

        t2.start();
    }
}
