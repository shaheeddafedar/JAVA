// 60. Create a program using do-while to implement a number guessing game.

package Recursion_challenges;

import java.util.Scanner;

public class numberguessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=(int)(Math.random() * 10);
        int guessnum;
        do {
            System.out.print("Guess the Number Between 1 to 10 ");
        guessnum = input.nextInt();
        } while (guessnum!=number);
        System.out.println("The Enter Number for guess is Correct");

    }
}
