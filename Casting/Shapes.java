package Casting;

public abstract class Shapes {

    public abstract void area();

    public static void main(String[] args) {

        Shapes c = new Circle();
        Shapes r = new Rectangle();

        Shapes[] s = {c, r};

        for (int i = 0; i < s.length; i++) {
            s[i].area();
        }
    }
}
