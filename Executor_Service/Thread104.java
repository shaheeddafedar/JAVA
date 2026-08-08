package Executor_Service;

public class Thread104 extends Thread {
    private String name;

    public Thread104(String name) {
        this.name = name;
    }

    int time = (int) (Math.random() * 5) + 1;


    public void run() {
        System.out.println("The Waiting time is "+time);
        System.out.println("The name is : " + name);
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            System.out.println("Exception during sleep " + e);
        }
    }
}
