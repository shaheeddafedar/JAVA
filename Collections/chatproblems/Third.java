// Q23
// Create a HashSet<Integer>.
// Add duplicate numbers.
// Print the set.
// What do you observe?
package Collections.chatproblems;

import java.util.HashSet;

public class Third {
    public static void main(String[] args) {

HashSet<Integer> hash = new HashSet<>();
  hash.add(20);
  hash.add(20);
  hash.add(30);
  hash.add(40);
  hash.add(50);
  hash.add(60);
  System.out.println(hash);
  
}
}
