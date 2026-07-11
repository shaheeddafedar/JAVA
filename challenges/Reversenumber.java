import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number  ");
    int num1 = input.nextInt();
    int Reversenumber = revers(num1);
    System.out.println("Your reversed Number is "+Reversenumber);
    }

    public static int revers(int num){
        int digit=0;
        int newNum =0;
        while (num>0) { 
            digit=num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return  newNum;
    }
}
