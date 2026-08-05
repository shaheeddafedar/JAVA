// 97. Enhance the Day enum by adding an attribute that indicates whether it is a weekday or weekend. Add a method in the enum that returns whether it's a weekday or weekend, and write a program to print out each day along  with its type

package mapinterface_and_enums;

public class Challenge97 {
    public static void main(String[] args) {

        for (Weekday days : Weekday.values()) {
            if (days.isWeekday()) {
                System.out.println("The Weekdays are");
                System.out.println(days);
                
            }
        }
    }
}
