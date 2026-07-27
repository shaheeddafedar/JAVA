package abstract_challenge;

public class Eagle extends Bird {
    @Override
    public void fly() {
        super.fly();
    }
    public static void main(String[] args) {
        Eagle e = new Eagle();
        System.out.println(e);
    }
}
