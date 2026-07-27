package abstract_challenge;

public class Eagle extends Bird {
    public Eagle(){
        super("booted eagles");
    }
    @Override
    public void fly() {
        System.out.println("Eagle is flying which is a  Breed of "+getBreed());
    }

    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
    }
}
