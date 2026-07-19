
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
       int greatest= num1>num2?num1:num2;
       System.out.println(greatest);
    }
}
