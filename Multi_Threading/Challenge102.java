// 102. Simulate a traffic signal using threads. Create three threads representing three signals: RED, YELLOW, and GREEN. Each signal should be on for a certain time, then switch to the next signal in order. Use sleep for timing and synchronize to make sure only one signal is active at a time.

package Multi_Threading;
public class Challenge102 {
    public static void main(String[] args) throws InterruptedException {
        Signal RED = new Signal(Signalcolor.RED);
        Signal YELLOW = new Signal(Signalcolor.YELLOW);
        Signal GREEN = new Signal(Signalcolor.GREEN);

        RED.start();
        RED.join();

        YELLOW.start();
        YELLOW.join();

        GREEN.start();
        GREEN.join();
    }
}
