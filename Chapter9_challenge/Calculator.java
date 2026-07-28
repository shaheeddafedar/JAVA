// 85. In a class Calculator, create multiple add() methods that overload each other and can sum two integers, three integers, or two doubles. Demonstrate how each can be called with different numbers of parameters

package Chapter9_challenge;

public class Calculator {

    protected int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    protected double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(25.6, 35.6));
        System.out.println(c.add(10, 20, 30));
    }

}
