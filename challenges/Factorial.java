
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enetr a number for your factioral ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        input.close();
        if (num1 < 0) {
            System.out.println("Negaive number");
        } else if (num1 == 0 || num1 == 1) {
            System.out.println("Factorial of " + " " + num1 + " is " + " " + 1);
        } else {
            int result = factorial(num1);
            System.out.println("Factorial of " + " " + num1 + " is " + " " + result);
        }
    }

    public static int factorial(int num1) {
        int fact = 1;
        for (int i = 2; i <= num1; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
