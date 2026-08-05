// 96. Create an enum called Day that represents the days of the week. Write a program that prints out all the days of the week from this enum

package mapinterface_and_enums;

public class Challenge96 {
    public static void main(String[] args) {
        for (Days days : Days.values()) {
            System.out.println(days + " : " + days.action);
        }

    }
}
