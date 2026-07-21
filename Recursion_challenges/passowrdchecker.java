// 59. Create a program using do-while to find password checker until a valid 
// password is entered.

package Recursion_challenges;
import java.util.Scanner;


// package Recursion_challenges;

// import java.util.Scanner;

// public class passowrdchecker {

//     public void check_passowrd(String password){
//                 Scanner input = new Scanner(System.in);
//          String verfiypassowrd;
//         do {
//             System.out.println("Enter your password again");
//             verfiypassowrd=input.next();
//         } while (password==verfiypassowrd);
//        System.out.println("The Verifyed Passowrd is correct"); 
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your Password");
//         String Password =input.next();

//         passowrdchecker check = new passowrdchecker();

//         check.check_passowrd(Password);
//     }

    
// }


 public class passowrdchecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your passowrd");
    String Passowrd = input.next();
    String verifypassowrd;

    do {
        System.out.println("Enter your Passord again for verify");
        verifypassowrd=input.next();
    } while (!Passowrd.equals(verifypassowrd));
    System.out.println("Enterd Passsword is correct");
  }

}

