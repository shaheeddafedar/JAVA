import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number  ");
        int num1 = input.nextInt();
        System.out.println("fibonacci numbers are");
             fibonacci(num1);
             

    }

    public static void fibonacci(int num) {
        if (num<0) {
            System.out.println("Please enter a non-negative number");
        }
        int first = 0;
        int second = 1;
        int next = 0;

        for (int i = 0; i <= num; i++) {

            next = first;

            System.out.println(next);

            first = second;
            second = first + next;
        }
    }
}




// public class Fibonacci {

//     public static void main(String[] args) {

//         int num = 7;
//         int first = 0;
//         int second = 1;

//         for (int i = 0; i <= num; i++) {

//             System.out.println(first);

//             int next = first + second;

//             first = second;
//             second = next;
//         }
//     }
// }