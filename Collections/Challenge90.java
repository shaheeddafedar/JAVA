// 90. Write a program that sorts a list of String objects in descending order using a custom Comparator.
package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge90 {
    public static void main(String[] args) {
         List <String> str = Arrays.asList("Lion","Ant","Bear","Zebra");   
         sortInDescending(str);
        System.out.println(str);
        }


     public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.equals(t1)) {
                    return 0;
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

}





// package Collections;

// import java.util.Arrays;
// import java.util.List;

// public class Challenge90 {
//     public static void main(String[] args) {
//          List <String> str = Arrays.asList("Lion","Ant","Bear","Zebra");   
//          descendingStr(str);
//         }

//     public static void descendingStr(List<String> str) {
//     for (int i = 0; i < str.size(); i++) {
//         for (int j = i + 1; j < str.size(); j++) {
//             if (str.get(i).compareTo(str.get(j)) < 0) {
//                 String temp = str.get(i);
//                 str.set(i, str.get(j));
//                 str.set(j, temp);
//             }
//         }
//     }

//     System.out.println(str);
// }

// }
