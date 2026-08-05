// 98. Create a Map where the keys are country names (as String) and the values are their capitals (also String). Populate the map with at least five countries and their capitals. Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map.

package mapinterface_and_enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge98 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("United States", "Washington, D.C.");
        map.put("United Kingdom", "London");
        map.put("Japan", "Tokyo");
        map.put("Australia", "Canberra");
        map.put("Canada", "Ottawa");
        map.put("France", "Paris");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The country Name");
        String Country = input.nextLine();

        if (map.containsKey(Country)) {
            System.out.println("The Captial of "+Country+" is "+map.get(Country));
        }else{
            System.out.println("Country not avaible");
        }
        input.close();
    }


}
