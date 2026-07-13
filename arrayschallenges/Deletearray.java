// Create a program to return a new array deleting a specific element.

package arrayschallenges;

import java.util.Scanner;

public class Deletearray {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lenght of array  ");
        int size = input.nextInt();
        int[] array = new int[size];
        inputarray(array, input);
        System.out.print("Enter the Deleting key");
       int deletekey =input.nextInt();
       System.out.println("New array is ");
       newArray(array, deletekey);
  
    }
    public static void inputarray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }
    }
  public static void newArray(int []array,int deletekey){
          int []newarray = new int[array.length-1];
           for (int i = 0,j=0; i <array.length; i++) {
            if (array[i]!=deletekey) {
               newarray[j]=array[i];
             System.out.println(newarray[j]);
             j++;
            }
       }
  }
}




    // int []array={1,2,3,4,5,6};
    //    int []newarray = new int[array.length-1];
    //    int deletekey = 3;
    //    for (int i = 0; i <array.length; i++) {
    //         if (array[i]!=deletekey) {
    //             System.out.println(array[i]);
    //         }
    //    }  
    // }