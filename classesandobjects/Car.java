package classesandobjects;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInListers;
    int noOfSheets;

    public void drive(){
        if (currentFuelInListers==0) {
            System.out.println("Car is Out of Fuel");
        } else if (currentFuelInListers<=5) {
            System.out.println("Car is driving");
            System.out.println("Car is Under the Reserve");
            currentFuelInListers--;
        } else {
        System.out.println("Car is driving");
        currentFuelInListers--;
        }

    }
    public  void  addFuel(float fuel){
        currentFuelInListers+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInListers;
    }
}
