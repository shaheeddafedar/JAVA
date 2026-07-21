// 65 Create a program using break to read inputs from the user in a loop and break 
// the loop if a specific keyword (like "exit") is entered.
package Recursion_challenges;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String key = "exit";
        String guess;
        do {
            System.out.println("Guess the keyword");
            guess = input.next();
            if (guess.equalsIgnoreCase(key)) {
                break;
            }
        } while (true);
        input.close();

        System.out.println("Guees word is correct");
    }
}
