// Simulate a dice roll using Math.random() and display the outcome 
// (1 to 6)
package challenges7chapter;

public class dice {
    public static void main(String[] args) {
        int random = (int)(Math.random()*6)+1;
        System.out.printf("The dice number is %d",random);
    }
}
