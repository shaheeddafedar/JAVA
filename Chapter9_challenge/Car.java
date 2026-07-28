package Chapter9_challenge;

public class Car extends Vehicle {
    @Override
    protected void service() {
        super.service();
        System.out.println("Every Car should be Service once in Month");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.service();
    }
}
