package Executor_Service.Chat_challenges;

public class problem3  extends Thread{
 
  public void run(){
    System.out.println("name is "+getName());
  }


  public static void main(String[] args) throws InterruptedException  {
    problem3 p1 = new problem3();
    problem3 p2 = new problem3();

    p1.start();
    p1.join();
    p2.start();
  }
}
