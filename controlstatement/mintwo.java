package controlstatement;

import java.util.Scanner;

public class mintwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number one");
        int num1 = input.nextInt();
        System.out.println("Enter Number two");
        int num2 = input.nextInt();
        input.close();

        int minimum = num1 < num2 ? num1 : num2;

        System.out.println("Minimum number is " + minimum);
    }
}