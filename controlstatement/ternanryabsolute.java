// 55. Create a program to calculate the absolute value of a given 
// integer.
package controlstatement;

import java.util.Scanner;

public class ternanryabsolute {
    public void absolutevalue(int num) {
        int result = num>=0 ? num :-num;
        System.out.println("The Absolute Value of "+num+" is :"+result);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number to Check absolute value  ");
        int num = input.nextInt();
        ternanryabsolute absolute = new ternanryabsolute();
        absolute.absolutevalue(num);
         input.close();
    }

}
