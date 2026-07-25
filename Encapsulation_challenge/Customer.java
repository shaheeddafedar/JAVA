package Encapsulation_challenge;

public class Customer {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("union7861", "Alice", 3200);
        customer1.deposit(3000);
        customer1.withdraw(-5);
    }
}
