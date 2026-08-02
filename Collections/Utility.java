package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public static List<Integer> inputList() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        // Don't close the scanner if you plan to use System.in later
        return list;
    }
}