package classesandobjects;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInListers;
    int noOfSheet;

    Car (){
      color="Black";
      noOfWheels=4;
      maxSpeed=200;
      currentFuelInListers=7;
      noOfSheet=5;
    }

    public Car start(){
         if (currentFuelInListers==0) {
            System.out.println("Car is Out of Fuel");
        } else if (currentFuelInListers<=5) {
            System.out.println("Car started  bruhhh...");
            System.out.println("Car is Under the Reserve");
        } else {
            System.out.println("Car started  bruhhh...");
        }
        return this;
    }

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
