
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println("Enter the input Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = sumOfDigit(num);
        System.out.println("Sum of Digit is " + result);

    }

    public static int sumOfDigit(int num) {
        int digit = 0;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
