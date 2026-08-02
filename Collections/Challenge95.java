// 95. Write a program that takes a string and returns the number of unique characters using a Set.
package Collections;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Challenge95 {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String userStr = input.nextLine();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }

        System.out.printf("Your string has %d unique characters",
                unique.size());
    }
}




