// 98. Create a Map where the keys are country names (as String) and the values are their capitals (also String). Populate the map with at least five countries and their capitals. Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map.

package mapinterface_and_enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge98 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("india", "New Delhi");
        map.put("united states", "Washington, D.C.");
        map.put("united kingdom", "London");
        map.put("japan", "Tokyo");
        map.put("australia", "Canberra");
        map.put("canada", "Ottawa");
        map.put("france", "Paris");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The country Name : ");
        String country = input.nextLine().trim().toLowerCase();

        if (map.containsKey(country)) {
            System.out.println("The Captial of " + country + " is " + map.get(country));
        } else {
            System.out.println("country not avaible in Your System");
        }
        input.close();
    }

}
