import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a Number  ");
        int num1 = input.nextInt();
        input.close();
        if (primenumber(num1)) {
            System.out.println(num1 + " is a primeNumber");
        } else {
            System.out.println(num1 + " is not a primeNumber");

        }
    }

    public static boolean primenumber(int num) {
        if (num <= 1) {
            System.out.println(num + "is not a prime Number");
        }
        int i = 2;

        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}

// int num =11;
// int i =2;
// boolean isprime = true;
// while (i<num) {
// if (num%1==0 && num%i==0) {
// isprime=false;
// break;
// }
// i++;
// }
// if (isprime) {
// System.out.println(num+" is a primeNumber");
// } else {
// System.out.println(num+" is not a primeNumber");

// }
