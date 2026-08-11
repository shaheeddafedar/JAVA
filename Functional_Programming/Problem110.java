// 110.Create your own functional interface with a single abstract 
// method that accepts an integer and returns a boolean. 
// Implement it using a lambda that checks if the number is 
// prime.
package Functional_Programming;

import java.util.Scanner;

public class Problem110 {
     interface intergernumber{
   boolean bollennumber(int num);
     }
    public static void main(String[] args) {
      intergernumber inte = (num)->{
        int count =0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            return true;
        } else{
            return false;
        }
      };
     Scanner input = new Scanner(System.in);
      System.out.print("Enter the  number you want to check for prime  :");
      int a = input.nextInt();
      System.out.println(inte.bollennumber(a)); 
      if (inte.bollennumber(a)) {
        System.out.println("The Given Number Is a Prime Number");
      } else {
                System.out.println("The Given Number Is Not  a Prime Number");
      }
    }
}
