
// ### Q24.

// Create a `PriorityQueue<Integer>`.

// Insert:

// ```text
// 30
// 10
// 50
// 20
// ```

// Remove all elements using `poll()` and print them.
package Collections.chatproblems;

import java.util.PriorityQueue;

public class fourth {
    public static void main(String[] args) {
        PriorityQueue<Integer> prior = new PriorityQueue<>();
        prior.add(30);
        prior.add(10);
        prior.add(50);
        prior.add(20);

        while (prior.size()!=0) {
System.out.println(prior.poll());
        }
    }
}
