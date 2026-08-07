package Multi_Threading;

public enum Signalcolor {
    RED(9000), YELLOW(1000), GREEN(5000);

    private final int time;

    private Signalcolor(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

}
