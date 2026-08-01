// 89. Write a method concatenate Strings that takes variable arguments  of String type and concatenates them into a single string.
package Collections;

import java.util.Scanner;

public class challenge89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many String u want to Enter ?...");
        int n = input.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = input.nextLine();
        }
        String resut = concatenateStrings(str);
        System.out.print(resut);
        input.close();
    }

    public static String concatenateStrings(String... str) {
        StringBuilder combined = new StringBuilder();
        for (String string : str) {
            combined.append(string).append(" ");
        }
        return combined.toString();

    }

}
