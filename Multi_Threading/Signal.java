package Multi_Threading;

public class Signal extends Thread {
    private Signalcolor color;

    public Signal(Signalcolor color) {
        this.color = color;
    }

    public void run() {
        System.out.println(" Active Signal " + color);

        try {
            Thread.sleep(color.getTime());

        } catch (InterruptedException e) {
            System.out.println("Interrupted During Signal Colour " + e);
        }
        System.out.println(" InActive Signal " + color);
    }
}
