// 108.Given a list of strings, use stream operations to filter out strings that have length of 10 or more and then concatenate the remaining strings.


package Functional_Programming;

import java.util.List;

public class Problem108 {
    public static void main(String[] args) {
        List<String> list =  List.of("Learning a  ", "bad",
"is teaching java", "ghativa", "ganda", " Coding", "Best Youtube programming channel");
      String result =  list.stream().filter(l->l.length()>10).reduce("",(a,b)->a+" "+b);
     System.out.println(result);
    }
}
