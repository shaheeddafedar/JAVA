import java.util.Scanner;

public class sumodd {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int oddnumber = input.nextInt();
sumOdd(oddnumber);
   
}

public static void sumOdd (int num1){
   int i = 1;
   int sum =0;
   while (i<=num1) { 
       if (i%2!=0) {
            sum = sum + i;
       }

       i++;
   }
   System.out.println("sum of "+sum);
    
}
}