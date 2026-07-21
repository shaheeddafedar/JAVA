// 66. Create a program using continue to sum all positive numbers entered by the 
// user; skip any negative numbers.
package Recursion_challenges;

public class sumpositiveex {
    public static void main(String[] args) {

        int[] array =ArrayUtility.inputArray();
        sumPositive(array);
        int sum = sumPositive(array);
        System.out.println("sum is : " + sum);

    }

    public static int sumPositive(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }
        return sum;
    }
}
