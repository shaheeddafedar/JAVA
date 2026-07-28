package Casting;

import abstract_challenge.Cricle;

public abstract class Shapes {
    public static void main(String[] args) {
        Cricle c = new Circle();
        Rectangle r = new Rectangle();
        Shapes s = new Shapes();
        s[c,r];

        for (int i = 0; i < s.length; i++) {
            System.out.println(i);
        }
    }
}
