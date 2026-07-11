// import java.util.Scanner;

// public class Gcd {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter Number one ");
//         int num1 = input.nextInt();
//         System.out.print("Enter Number two ");
//         int num2 = input.nextInt();
//         int GCD = GCD(num1, num2);
//         System.out.println("GCD is " + GCD);

//     }

//     public static int GCD(int num1, int num2) {
//         int i = 1;
//         int limit = 0;
//         int GCD = 1;

//         if (num1 < num2) {
//             limit = num1;
//         } else {
//             limit = num2;
//         }

//         while (i <= limit) {
//             if (num1 % i == 0 && num2 % i == 0) {
//                 GCD = i;
//             }
//             i++;
//         }
//         return GCD;
//     }

// }




import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number one ");
        int num1 = input.nextInt();
        System.out.print("Enter Number two ");
        int num2 = input.nextInt();
        int GCD = GCD(num1, num2);
        System.out.println("GCD is " + GCD);

    }

    public static int GCD(int num1, int num2) {
        int i = 1;
        int GCD = 1;
        int least = least(num1, num2);

        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
            i++;
        }
        return GCD;
    }

    public static int least(int num1, int num2) {
         if (num1<num2) {
             return num1;
         } else {
           return  num2;
         }

    }

}
