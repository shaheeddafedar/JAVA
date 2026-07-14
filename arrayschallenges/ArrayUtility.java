package arrayschallenges;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }

        return array;
    }
}

