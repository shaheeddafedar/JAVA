// 63. Create a program using for-each to find the maximum value in an integer array.

package Recursion_challenges;


public class MaxinArray {
    public static void main(String[] args) {

        int[] arrays = ArrayUtility.inputArray();

        int max = 0;
        for (int values : arrays) {
            if (values > max)
                max = values;
        }
        System.out.println("The Maximum Value of Array is : "+max);
    }

}
