
import java.util.Scanner;

public class Table {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number for table");
        int n = input.nextInt();
        int i =1;
     while (i<=10) { 
        int sum = n*i;
                  System.out.println(sum);

         i++;
     }

    }
}
