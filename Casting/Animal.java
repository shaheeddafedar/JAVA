package Casting;

public class Animal {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.bark();
    }
}
