// 106.Write a lambda expression that takes two integers and  returns their multiplication. Then, apply this lambda to a  pair of numbers.


package Functional_Programming;

import java.util.Scanner;


public class problem106 {
    interface multip {
int multiplication(int a, int b);
}
    public static void main(String[] args) {
      multip multi = (a,b)->a*b;  
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the First number :");
      int a = input.nextInt(); 
      System.out.print("Enter the Second number :");
      int b = input.nextInt(); 
      input.close();
      System.out.println("The multiplication is : "+multi.multiplication(a, b));

    }
}
