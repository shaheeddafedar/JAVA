// Create a program to find number of occurrences of an element in an array.

package arrayschallenges;

import java.util.Scanner;

public class NumberofOccurance {
    public static void main(String[] args) {
        int []values = {1,2,3,4,5,6,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elemet u need to find the number occurrence  ");
        int key = input.nextInt();
        input.close();
        int occurrence = findOccurrence(values, key);
        System.out.println("The number of occurance is "+occurrence);  
    }

    public static int findOccurrence(int []values,int key){
        int occurrence=0;
        for (int i = 0; i <values.length; i++) {
            if (values[i]==key) {
                occurrence++;
            }
        }
        return occurrence;
    }
    }
    

