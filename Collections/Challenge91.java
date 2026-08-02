// 91. Use the Collections class to count the frequency of a particular element in an ArrayList.

package Collections;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge91 {
    public static void main(String[] args) {
        List<Integer> list = Utility.inputList();
        Scanner input = new Scanner(System.in);

        System.out.println("Eneter the element to find frequency");
        int f = input.nextInt();

        int count = Collections.frequency(list, f);
        System.out.printf("Frequency of element %d: %d", f, count);

        input.close();
    }
}
