package Multi_Threading;

public class helloThread extends Thread {
    private int X;

    public helloThread(int x) {
        X = x;
    }

    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.println(i+" Hello from Thread "+X);
        }
    }
    
}
