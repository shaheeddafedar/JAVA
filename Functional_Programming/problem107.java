// 7.Convert an array of strings into a stream. Then, use the stream to print each string to the console

package Functional_Programming;

import java.util.Arrays;
import java.util.stream.Stream;

public class problem107 {
    public static void main(String[] args) {
        String [] Arrry ={"apple","Mango","Grapes","Banana","Dates"};

       Stream<String> st = Arrays.stream(Arrry);
       st.forEach(s->System.out.println(s));
    }
}



// package Functional_Programming;

// import java.util.List;

// public class problem107 {
// public static void main(String[] args) {
// List mylist =List.of("apple","banan","mango","date");

//     mylist.stream().forEach(s->System.out.println(s));
// }


// }