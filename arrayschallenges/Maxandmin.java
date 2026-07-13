//  Create a program to find the maximum and minimum element in an array.
package arrayschallenges;

import java.util.Scanner;

public class Maxandmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] values = new int[size];
        inputarray(values, input);

        int max = Max(values);
        int min = Min(values);

        System.out.println("Maximum valus is " + max);
        System.out.println("Minimum valus is " + min);
    }

    public static void inputarray(int[] values, Scanner input) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter element " + i + ": ");
            values[i] = input.nextInt();
        }
    }

    public static int Max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int Min(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}
