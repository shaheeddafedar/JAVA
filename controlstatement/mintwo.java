package controlstatement;

import java.util.Scanner;

public class mintwo {
    public int minternary(int num1,int num2){
        return num1 < num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number one");
        int num1 = input.nextInt();
        System.out.print("Enter Number two");
        int num2 = input.nextInt();
        input.close();
         mintwo min = new mintwo();   
        int minimum = min.minternary(num1, num2);

        System.out.print("Minimum number is " + minimum);
    }
}