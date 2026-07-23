// 74. Create a number guessing game where the program selects a 
// random number, and the user has to guess it.
package challenges7chapter;

import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        int attempts = 0;
        int guess;
        do {
            System.out.print("Enter Your Guess Between(0 To 100)");
            guess = input.nextInt();
            attempts = attempts + 1;
            System.out.printf("Total Attempts : %d \n", attempts);
            if (guess > random) {
                System.out.println("Given TOO high");
            } else if (guess < random) {
                System.out.println("Given too low");
            
            }
        } while (random != guess);
        System.out.println("🎉 Correct!");
        System.out.println("You guessed the number in " + attempts + " attempts.");
        input.close();
    }
}
