//  Create a program to do sum and average of all elements in a 2-D array
package arrayschallenges;

public class SumAndAverga {
    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();

        int sum = sumarray(array);
        System.out.println("Sum of Array is " + sum);

        float average = averga(array, sum);
        System.out.println("Average of Array is " + average);
    }

    public static int sumarray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static float averga(int[][] array, int sum) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                length = length + 1;
            }
        }

        float average = sum / length;
        return average;
    }
}
