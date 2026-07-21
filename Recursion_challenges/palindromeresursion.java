// Create a program using recursion to check if a string is a palindrome using 
// recursion
package Recursion_challenges;

import java.util.Scanner;

public class palindromeresursion {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your String :");
    String str = input.next();
    System.out.println("Your String is  "+(isPalindrome(str)?"palindrome":"not a palindrome"));
    input.close();
    
 }  
 public static boolean isPalindrome(String str){
    if (str.length()<=1) {
        return true;
    }
    int lastpost = str.length()-1;
    if (str.charAt(0)!=str.charAt(lastpost)) {
        return false;
    }

    String newstr= str.substring(1,lastpost);

    return isPalindrome(newstr);
 } 
}
