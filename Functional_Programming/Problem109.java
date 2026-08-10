// 109.Given a list of integers, use stream operations to filter odd numbers and print them

package Functional_Programming;

import java.util.List;

public class Problem109 {
    public static void main(String[] args) {
        List<Integer> intlist = List.of(2,4,6,3,5,10,7,9);
        intlist.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
    }
}
