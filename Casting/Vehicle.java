package Casting;

public class Vehicle {
    public void start(){
        System.out.println("Vehicle Start with sound vhooz");
    }
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
