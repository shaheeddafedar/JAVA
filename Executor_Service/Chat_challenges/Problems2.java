package Executor_Service.Chat_challenges;

public class Problems2  implements Runnable {
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(i +"Hello");
        }
    }
public static void main(String[] args) {
    Problems2 p1 = new Problems2();
  Thread t1 = new Thread(p1
  );
  t1.start();
}
}
