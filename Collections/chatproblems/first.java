// Write a method using **varargs** that returns the **largest** number from the given integers.
package Collections.chatproblems;

public class first{
    public static void main(String[] args) {
       System.out.println(larget(2,3,3,45,6,67)); 

        
    }
    public static int larget(int... element){
        int max =0;
     for (int i : element) {
        if (i>max) {
            max =i;
        }
     }
        return max;
    }
}
