// Create a program to find the sum and average of all elements in an array.

package arrayschallenges;

import java.util.Scanner;

public class Sumandaverga_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] values = new int[size];

        inputarray(values, input);
        int sum = sum(values);
        float average = avergae(values, sum);

        System.out.println("Sum of Array is " + sum);
        System.out.println("Average of Array is " + average);

    }

    public static void inputarray(int[] values, Scanner input) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter element " + i + ": ");
            values[i] = input.nextInt();
        }
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static float avergae(int[] values, int sum) {
        float avergae;
        avergae = (float) sum / values.length;
        return avergae;
    }

}







    //       int sum=0;
    //       float average=0;     
    //    for (int i = 0; i <values.length; i++) {
    //        sum+=values[i];
    //    }
    //     average= (float) sum/values.length;
    //    System.out.println("sum is "+ sum);
     //    System.out.println("average is "+average);

