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
