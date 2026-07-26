// 82 Create a class ArrayOperations with a static nested class Statistics. Statistics could have methods like mean(), median(), which operate on an array

package Inheritance_challenge;

public class ArrayOperations {

    static int[] array = { 10, 20, 40, 30, 50 };

    static  class Statistics{
        public void mean(){
              int sum =0;
            for (int i = 0; i < array.length; i++) {
                sum+=array[i];
            }
            sum/= array.length;
            System.out.println("The mean value is "+sum);

        }
        public void median(){
             for (int i = 0; i < array.length - 1; i++) {
           int temp = array[i];
array[i] = array[i + 1];
array[i + 1] = temp;
        }
        int medians=array[array.length/2];
        System.out.println("median is "+medians);
    }
    // public static void main(String[] args) {
    //     ArrayOperations arr = new ArrayOperations();
    //     ArrayOperations.Statistics st = new ArrayOperations.Statistics();
    //     st.mean();
    //     st.median();
    // }
}
}