// 85. In a class Calculator, create multiple add() methods that overload each other and can sum two integers, three integers, or two doubles. Demonstrate how each can be called with different numbers of parameters

package Chapter9_challenge;

public class Calculator {

    protected static  int  add(int a, int b) {
        return a + b;
    }

    protected static  int add(int a, int b, int c) {
        return a + b + c;
    }

    protected static  double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        System.out.println(add(10, 20));
        System.out.println(add(25.6, 35.6));
        System.out.println(add(10, 20, 30));
    }

}
