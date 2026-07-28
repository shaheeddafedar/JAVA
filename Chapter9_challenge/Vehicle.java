// 86. Define a base class Vehicle with a method service() and a subclass Car that overrides service(). In Car's service(), provide a specific implementation that calls super.service() as well, to show how overriding works
package Chapter9_challenge;

public class Vehicle {
   protected void service(){
    System.out.println("Time to Time Service is Important");
   } 
}
