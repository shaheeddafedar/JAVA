package classesandobjects;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInListers;
    int noOfSheets;

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInListers--;
    }
    public  void  addFuel(float fuel){
        currentFuelInListers+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInListers;
    }
}
