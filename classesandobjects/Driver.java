package classesandobjects;

public class Driver {
 public static void main(String[] args) {
    //  Car myCar = new Car();
    //  myCar.addFuel(6);
    //  myCar.drive();

   //  Car Audi  = new Car();
   //  Audi.addFuel(9);
   //  Audi.start().drive();

  Car swift = new Car();
  swift.start();
  swift.drive();
  System.out.println(  swift.getCurrentFuelLevel()
);
System.out.println(swift.color);
swift.color="white";
System.out.println(swift.color);

 }   
}
