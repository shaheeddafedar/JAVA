// 112.Write a function that accepts a string and returns an 
// Optional<String>. If the string is empty or null, return an 
// empty Optional, otherwise, return an Optional containing the 
// uppercase version of the string

package Functional_Programming;

import java.util.Optional;
import java.util.Scanner;

public class problem112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name :");
        String name = input.nextLine();
        input.close();
        System.out.println(Testotpional(name));
    }

    public static Optional<String> Testotpional(String name) {
        if(name == null || name.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(name.toUpperCase());
    }
}
