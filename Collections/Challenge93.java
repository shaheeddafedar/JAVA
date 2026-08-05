// 93 Create a program that reverses the elements of a List and prints the reversed list.
package Collections;

import java.util.List;

public class Challenge93 {
    public static void main(String[] args) {
        List<Integer> list = Utility.inputList();
        // Collections.reverse(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }
}
