// 102. Simulate a traffic signal using threads. Create three threads representing three signals: RED, YELLOW, and GREEN. Each signal should be on for a certain time, then switch to the next signal in order. Use sleep for timing and synchronize to make sure only one signal is active at a time.


package Multi_Threading;

public class Challenge102 {
    public static void main(String[] args) throws InterruptedException {
        Signal s1 = new Signal("RED");
        Signal s2 = new Signal("YELLOW");
        Signal s3 = new Signal("GREEN");

        s1.SignalLight();
        s2.SignalLight();
        s3.SignalLight();

        s1.join();
        s2.join();
        s3.join();
    }
}
