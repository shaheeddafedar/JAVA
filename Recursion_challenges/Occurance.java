// 64. Create a program using for-each to the occurrences of a specific element in an 
// array. 
package Recursion_challenges;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrays = ArrayUtility.inputArray();
        System.out.println("Enter the element to find occurance");
        int specificelement = input.nextInt();
        Occurances(arrays, specificelement);
        input.close();
    }

    public static void Occurances(int[] array, int specificelement) {
        int count = 0;
        for (int i : array) {
            if (i == specificelement) {
                count++;
            }
        }
        System.out.println("The Occuarnce of :" + specificelement + "is" + count);
    }
}
