// . Concatenate and Convert: Take two strings, concatenate them, 
// and convert the result to uppercase
package challenges7chapter;

import java.util.Scanner;

public class strexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First String");
        String str1 = input.nextLine();
        System.out.print("Enter The Second String");
        String str2 = input.nextLine();
        input.close();
        String str3 = str1.concat(" ").concat(str2);
        System.out.println(str3);

    }
}
