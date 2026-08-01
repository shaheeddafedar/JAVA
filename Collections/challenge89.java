// 89. Write a method concatenate Strings that takes variable arguments 
// of String type and concatenates them into a single string.
package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class challenge89 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
     String resut = concatenateStrings(str);
     System.out.print(resut);
    }
    public static String  concatenateStrings(String... str){
      String combined= "";
        for (String string : str) {
            combined += string;
        }
        return combined;
    }
}
