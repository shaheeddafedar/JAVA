import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number  ");
        int num = input.nextInt();
        input.close();
        int copynum = num;
        int checkplaindrome = palindrome_num(num);
        if ( checkplaindrome == copynum) {
            System.out.println("Number "+num+ " is plaindrome");
        } else {
            System.out.println("Number "+num+ " is not a palindrome ");
        }
    }

    public static int palindrome_num(int num) {
        int checkplaindrome = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            checkplaindrome = checkplaindrome * 10 + digit;
            num /= 10;
        }
        return checkplaindrome;
    }
}

// int num = 123;
// int copynum =num;
// int checkplaindrome =0;
// int digit =0;
// while (num>0) {
// digit=num%10;
// checkplaindrome=checkplaindrome*10+digit;
// num/=10;
// }

// if (checkplaindrome==copynum) {
// System.out.println("number is plaindrome");
// } else {
// System.out.println("Number is not a palindrome ");
// }