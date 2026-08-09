package Executor_Service.Chat_challenges;

public class problem1 extends Thread {

    public void run(){
        for (int i = 1; i <=5; i++) {
            if (i%i==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        problem1 p1 = new problem1();

        p1.start();
    }
    

}
