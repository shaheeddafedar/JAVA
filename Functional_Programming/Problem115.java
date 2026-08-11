// 115.Create a list of strings representing numbers ("1", "2", ...). Convert each string to an integer, then again calculating squares of each number using the map operation and sum up the resulting integers

package Functional_Programming;

import java.util.List;

public class Problem115 {
    public static void main(String[] args) {
        List<String> number = List.of("1", "2", "3", "4", "5");
        int sortnumbers = number.stream()
                .mapToInt(num -> Integer.parseInt(num) * Integer.parseInt(num))
                .sum();

        System.out.println(sortnumbers);

    }
}
