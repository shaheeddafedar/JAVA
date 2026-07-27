package abstract_challenge;

public abstract class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Many birds can fly, except for some, such as ostriches and chickens");
    }
}

