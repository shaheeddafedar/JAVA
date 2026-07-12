public class palindrome {
 public static void main(String[] args) {
    int num = 123;
    int copynum =num;
    int checkplaindrome =0;
    int digit =0;
    while (num>0) { 
        digit=num%10;
        checkplaindrome=checkplaindrome*10+digit;
        num/=10;
    }

    if (checkplaindrome==copynum) {
        System.out.println("number is plaindrome");
    } else {
        System.out.println("Number is not a palindrome ");
    }
 }   
}


    // int num = 123;
    // int copynum =num;
    // int checkplaindrome =0;
    // int digit =0;
    // while (num>0) { 
    //     digit=num%10;
    //     checkplaindrome=checkplaindrome*10+digit;
    //     num/=10;
    // }

    // if (checkplaindrome==copynum) {
    //     System.out.println("number is plaindrome");
    // } else {
    //     System.out.println("Number is not a palindrome ");
    // }