// Create a program to reverse an array.

package arrayschallenges;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] array = new int[size];

        inputarray(array, input);
        Reversearray(array);

    }

    public static void inputarray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    public static void Reversearray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }

    }
}
