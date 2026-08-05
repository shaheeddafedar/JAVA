package Multi_Threading;

public class Thread3 extends Thread {
     private int num;

   public Thread3(int num) {
    this.num = num;
   }

   public void run(){
    System.out.println("The Thread "+num+" " +Thread.currentThread().getName());
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        System.out.println("Exception during Thread "+num);
    }
   }

}
