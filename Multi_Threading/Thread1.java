package Multi_Threading;

public class Thread1 extends Thread {
    private int X;

    public Thread1(int x) {
        X = x;
    }

    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.println(i+" Hello from Thread "+X);
        }
    }
    
}
