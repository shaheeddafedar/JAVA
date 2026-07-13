// Create a program to check is the array is palindrome or not.

package arrayschallenges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] array = new int[size];

        inputarray(array, input);
        boolean ispalindrome = plaidrome(array);
        
        if (ispalindrome) {
            System.out.println("Given Array is a Palindrome");
        } else {
            System.out.println("Given Array is Not a Palindrome");
        }

    }

    public static void inputarray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }

    }

    public static boolean plaidrome(int[] array) {
        int[] check = new int[array.length];
        boolean ispalindrome = true;

        for(int i = 0; i < array.length; i++) {
            check[i] = array[i];
        }

        for(int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            if (check[j] != array[i]) {
                ispalindrome = false;
            }
        }
        return ispalindrome;
    }
}

// int []array ={1,2,1,2};
// int []check= new int[array.length];

// boolean ispalindrome = false;
// for (int i = 0; i <array.length; i++) {
// check[i]=array[i];
// }

// for (int i = array.length-1,j=0; i>=0; i--,j++) {
// if (check[j]==array[i]) {
// ispalindrome=true;
// }else{
// ispalindrome=false;
// }

// }
// if (ispalindrome) {
// System.out.println(" array is a plaidrome");
// } else {
// System.out.println(" array is not a plaidrome");
// }