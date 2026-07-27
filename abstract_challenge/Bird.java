package abstract_challenge;

public abstract class Bird implements Flyable {

    private String breed;
    
    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println("Many birds can fly, except for some, such as ostriches and chickens");
    }

}

