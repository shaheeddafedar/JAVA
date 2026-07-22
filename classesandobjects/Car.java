package classesandobjects;

public class Car {
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInListers;
    int noOfSheet;

    Car(String colour) {
        this.colour = colour;
        noOfWheels = 4;
        maxSpeed = 200;
        currentFuelInListers = 7;
        noOfSheet = 5;
    }
 

    // constructor Chaning
    Car() {
        colour = "Black";
    }

    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", colour=" + colour + ", maxSpeed=" + maxSpeed
                + ", currentFuelInListers=" + currentFuelInListers + ", noOfSheet=" + noOfSheet + "]";
    }


    public Car start() {
        if (currentFuelInListers == 0) {
            System.out.println("Car is Out of Fuel");
        } else if (currentFuelInListers <= 5) {
            System.out.println("Car started  bruhhh...");
            System.out.println("Car is Under the Reserve");
        } else {
            System.out.println("Car started  bruhhh...");
        }
        return this;
    }

    public void drive() {
        System.out.println("Car is driving");
        currentFuelInListers--;
    }

    public void addFuel(float fuel) {
        currentFuelInListers += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInListers;
    }
}
