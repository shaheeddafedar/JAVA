//  Create a program using continue to print only even numbers using continue for 
// odd numbers.
package Recursion_challenges;

import java.util.Scanner;

public class Evennumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter value of  n");
        int n = input.nextInt();

        for (int i = 0; i <=n; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println("The even number is :"+i);
        }
    }
}
