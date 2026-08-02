// 92. Write a method that swaps two elements in an ArrayList, given their indices.

package Collections;

import java.util.List;
import java.util.Scanner;

public class Challenge92 {
    public static void main(String[] args) {
        List<Integer> list = Utility.inputList();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first element index to swap");
        int x = input.nextInt();
        System.out.println("Enter second element index to swap");
        int y = input.nextInt();
        System.out.println(list);

        if (x >= 0 && x < list.size() && y >= 0 && y < list.size()) {
            swap(list, x, y);
            System.out.println(list);

        } else {
            System.out.println("Invalid index input");
        }
        input.close();
    }

    public static void swap(List<Integer> list, int x, int y) {
        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);

    }

}
