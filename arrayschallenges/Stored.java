// 43. Create a program to check if the given array is sorted.

package arrayschallenges;

import java.util.Scanner;

public class Stored {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] array = new int[size];

        inputarray(array, input);
        boolean issort = issorted(array);
        
        if (issort) {
            System.out.println("Array is sorted ");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static void inputarray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    public static boolean issorted(int[] array) {
        boolean issort = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                issort = false;
            }
        }
        return issort;
    }
}
