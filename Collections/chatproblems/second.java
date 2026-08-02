// Create an ArrayList<String>.

// Add five fruits.

// Sort them in ascending order using the Collections class.
package Collections.chatproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class second {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
                List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Orange", "Grapes");
            Collections.sort(list);
                System.out.println(list);

    }
}
