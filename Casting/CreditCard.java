package Casting;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Need to pay CreditCard bill ");
    }
}
