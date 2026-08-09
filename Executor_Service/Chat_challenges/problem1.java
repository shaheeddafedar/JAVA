package Executor_Service.Chat_challenges;

public class problem1 extends Thread {

    public void run() {
        for (int i = 2; i <= 5; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        problem1 p1 = new problem1();
        p1.start();
    }
}