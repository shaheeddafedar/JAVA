// 87. Arithmetic Exception Handling Write a program that asks the user to enter two integers and then divides the first by the second. The program should handle any arithmetic exceptions that may occur (like division by zero) and display an appropriate message.
// Key Points:
// • Use Scanner to read user input.
// • Implement a try-catch block to handle ArithmeticException.
// • Display a user-friendly message if division by zero occurs.

package Exception__challenge;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number 1 ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Number 2 ");
        int num2 = input.nextInt();
        input.close();
        divide(num1, num2);
    }

    public static void divide(int num1, int num2) {
        int result;
        try {
            result = num1 / num2;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Cannot divide by zero. Please enter a non-zero divisor." + e);

            } else {
                throw e;
            }
        }

    }
}
