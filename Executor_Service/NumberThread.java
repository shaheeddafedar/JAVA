package Executor_Service;

public class NumberThread implements Runnable {
    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
}
