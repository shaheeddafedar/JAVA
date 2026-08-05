// 101. Create three threads. Ensure that the second thread starts only after the first thread ends and the third thread starts only after the second thread ends using the join method. Each thread should print its start and end along with its name.


package Multi_Threading;

public class Challenge101 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(1);
        Thread1 t2 = new Thread1(2);
        Thread1 t3 = new Thread1(3);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception during Thread " + t1.getNum());
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception during Thread " + t1.getNum());
        }

        t3.start();

        try {

            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Exception during Thread " + t1.getNum());
        }
    }
}
