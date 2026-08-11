// 111.Write two versions of a program that calculates the factorial 
// of a number: one using structural (procedural) programming, 
// and the other using functional programming.

package Functional_Programming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem111 {
    interface factorial {
        int fact(int num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factrioal Number  :");
        int num = input.nextInt();
        input.close();
        System.out.println("Factrioal Using  Structural programming "+Fact(num));

        // functional programming
        System.out.print("Factrioal Using  Functional programming ");
       IntStream.rangeClosed(2, num)
       .reduce((a,b)->a*b).ifPresent(System.out::print);

    }

    // Structural Programming
    public static int Fact(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

// public class Problem111 {
// interface factorial {
// int fact(int num);
// }

// public static void main(String[] args) {
// // Structural Programming
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the number you want to check for prime :");
// int num1 = input.nextInt();
// input.close();
// int fact = 1;
// for (int i = 2; i <= num1; i++) {
// fact = fact * i;
// }
// System.out.println("Factioral using Structural Programming " + fact);

// // functional programming
// factorial facto = (num) -> {
// int facties = 1;
// for (int i = 2; i <= num; i++) {
// facties = facties * i;
// }
// return facties;
// };
// System.out.println("Factioral using functional programming " +
// facto.fact(num1));

// }

// }