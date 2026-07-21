package Recursion_challenges;

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
    input.close();

        return array;
    }

      public static int[][] input2DArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array row: ");
        int rows = input.nextInt();
           System.out.print("Enter array columns: ");
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i <rows; i++) {
          for (int j = 0; j <columns; j++) {
              System.out.print("Please enter element row:" + (i+1)
                        + ", column: " + (j+1) + " :");
                        array[i][j] = input.nextInt();
          }
        }
            input.close();


        return array;
    }
}

