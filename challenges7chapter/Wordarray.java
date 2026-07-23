// 75 Take an array of words and concatenate them into a single string 
// using StringBuilder.
package challenges7chapter;

import java.util.Scanner;

public class Wordarray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();
        input.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter element " + i + ": ");
            words[i] = input.nextLine();
        }
        input.close();
        StringBuilder sb = new StringBuilder();

       for (String string : words) {
          sb.append(string).append(" ");
       }
        
        System.out.println(sb);
    }

}
