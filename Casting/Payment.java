package Casting;

public interface Payment {
    void pay();

    public static void processPayment(Payment payment) {
        payment.pay();
    }

    public static void main(String[] args) {
        processPayment(new CreditCard());

        processPayment(new UPI());

        processPayment(new PayPal());

    }
}
