// 59. Create a program using do-while to find password checker until a valid 
// password is entered.

package Recursion_challenges;

import java.util.Scanner;

public class passowrdchecker {

    public boolean check_passowrd(String password) {
        return password.length() > 6;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        passowrdchecker check = new passowrdchecker();
        String Password;
        do {
            System.out.println("Enter your Password");
            Password = input.next();
        } while (!check.check_passowrd(Password));

        System.out.println("Your Passowrd is Valid");
    }

}

// public class passowrdchecker {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.println("Enter your passowrd");
// String Passowrd = input.next();
// String verifypassowrd;

// do {
// System.out.println("Enter your Passord again for verify");
// verifypassowrd=input.next();
// } while (!Passowrd.equals(verifypassowrd));
// System.out.println("Enterd Passsword is correct");
// }

// }
