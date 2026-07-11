
import java.util.Scanner;

public class LCM {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number one ");
    int num1 = input.nextInt();
    System.out.print("Enter Number two ");
    int num2 = input.nextInt();
    int LCM = LCM(num1, num2);
   System.out.println("LCM is "+ LCM);
}

public static int LCM(int num1, int num2){
    int i =1;
    while (true) { 
        if (i%num1==0 && i%num2 ==0) {
            return i;

        }
        i++;
    }
}
}




// Method 1
//  int a =2;
//      int b =3;
//     int i =1;
//     while (true) { 
//         if (i%a==0 && i%b==0) {
//             System.out.println("lcm " +i);
//             break;
//         }
//         i++;
//     }
    //    method 2
//     int max = a*b;
//     for (int i = 1; i <=max; i++){
//         if (i%a==0 && i%b==0) {
//             System.out.println("LCM is "+ i);
//             break;
//         }
//     }