// 110.Create your own functional interface with a single abstract  method that accepts an integer and returns a boolean.  Implement it using a lambda that checks if the number is  prime.
package Functional_Programming;

import java.util.Scanner;

public class Problem110 {
    interface Cadinate {
        boolean isprime(int num);
    }

    public static void main(String[] args) {
        Cadinate isprime = (num) -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  number you want to check for prime  :");
        int a = input.nextInt();
        input.close();
        if (isprime.isprime(a)) {
            System.out.println("The Given Number Is a Prime Number");
        } else {
            System.out.println("The Given Number Is Not  a Prime Number");
        }
    }
}
