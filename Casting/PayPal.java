package Casting;

public class PayPal implements Payment{
     @Override
    public void pay() {
        System.out.println("Need to pay PayPal bill ");
    }
}
