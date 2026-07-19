// 54. Create a program to find if the given number is even or odd.

package controlstatement;

import java.util.Scanner;

public class Evenorodd {

    public void checknum(int num) {
        String result = (num % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();
        input.close();
        Evenorodd check = new Evenorodd();
        check.checknum(num);

    }
}
