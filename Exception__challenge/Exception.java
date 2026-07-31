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
        System.out.println("Please Enter Number 1 ");
        int num1 = input.nextInt();
         System.out.println("Please Enter Number 2 ");
        int num2 = input.nextInt();
        input.close();
        int div = divide(num1, num2);
        System.out.println("Result is : "+div);
    }

    public static int divide(int num1,int num2){
        int div=0;
        try {
            div=num1/num2;
        } catch (ArithmeticException e) {
         System.out.println(e);  
        }
        return div;
        
    }
}
