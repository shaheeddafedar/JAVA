package Multi_Threading;

public class Signal extends Thread {
    String  Color;

    public Signal(String Color) {
        this.Color = Color;
    }

    synchronized  void SignalLight(){
        System.out.println("Current Signal light is "+Color);
        try {
                     sleep(5000);
        } catch ( InterruptedException e) {
            System.out.println("Exetin during the Sleep "+e);
        }
    }
}

