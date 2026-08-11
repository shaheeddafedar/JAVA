// 113.Given an array of integers, create a stream, use the distinct operation to remove duplicates, and collect the result into a new list

package Functional_Programming;
import java.util.List;
import java.util.stream.Collectors;

public class problem113 {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,2,4,6,7);
       List<Integer> disntincnumber = number.stream().distinct().collect(Collectors.toList());
       System.out.println(disntincnumber);
    }
}
