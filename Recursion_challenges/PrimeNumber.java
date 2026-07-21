package Recursion_challenges;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = input.nextInt();
        int result = PrimeNumbers(num);

        if (result==2) {
            System.out.println("The given Number is a Prime Number");
        } else {
          System.out.println("The given Number is Not Prime Number");
            
        }
        input.close();
        
    }
    
    public static int PrimeNumbers(int num){

        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        return count;
    }

}
