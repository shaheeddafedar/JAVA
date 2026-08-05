package Multi_Threading;

public class Thread2 extends Thread {
    private int X;

    public Thread2(int x) {
        X = x;
    }

    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.println(i+" Hello from Thread "+X);
        }
    }
    
}
