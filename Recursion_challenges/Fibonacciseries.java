// 68. Create a program using recursion to display the Fibonacci series upto a certain 
// number.

package Recursion_challenges;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the fibonnaci number");
        int n= input.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.println(Fibonacci(i));
            
        }
        
    }
    public static int Fibonacci(int n){
       if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
