// 78 Define a BankAccount class with private attributes like accountNumber, accountHolderName, and balance. Provide public methods to deposit and withdraw money, ensuring that these methods don't allow illegal operations like withdrawing more money than the current balance.

package Encapsulation_challenge;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Not a Valid deposit");
        } else {
            balance += amount;
        }

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("insufficient balance to withdraw");
        } else if ( amount<=0) {
            System.out.println("Invalid Withdraw");            
        } else {
            balance -= amount;

        }
    }

    public void display() {
        System.out.println("accountNumber :" + accountNumber);
        System.out.println("accountHolderName :" + accountHolderName);
        System.out.println("balance :" + balance);

    }
}
