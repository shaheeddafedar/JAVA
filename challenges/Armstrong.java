import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number  ");
        int num = input.nextInt();
        boolean armstrong = armStrong(num);
        if (armstrong) {
            System.out.println(num + " is a armStrong number");
        } else {
            System.out.println(num + " is Not armStrong number");

        }
    }

    public static boolean armStrong(int num) {
        int digit = 0;
        int checkarm = 0;
        int originalnum = num;
        int count = checkCount(num);
        while (num > 0) {
            digit = num % 10;
            checkarm += power(digit, count);
            num /= 10;
        }
        if (checkarm == originalnum) {
            return true;
        } else {
            return false;
        }

    }

    public static int power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        
        return result;
    }


    public static int checkCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}

// public class Armstrong {
// public static void main(String[] args) {
// int num = 153;
// int originalnum = num;
// int digit = 0;
// int checkarm = 0;
// int count = 0;
// while (num > 0) {
// num %= 10;
// count++;
// num /= 10;
// }
// num = originalnum;
// while (num > 0) {
// digit = num % 10;
// checkarm += (int) Math.pow(digit, count);
// num /= 10;
// }
// if (checkarm == originalnum) {
// System.out.println("num is a armstrong number ");

// }
// }
// }
